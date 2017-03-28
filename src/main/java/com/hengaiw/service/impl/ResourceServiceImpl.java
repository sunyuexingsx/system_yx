package com.hengaiw.service.impl;

import com.hengaiw.mapper.ResourceMapper;
import com.hengaiw.mapper.RoleMapper;
import com.hengaiw.mapper.RoleResourceMapper;
import com.hengaiw.mapper.UserRoleMapper;
import com.hengaiw.model.Resource;
import com.hengaiw.model.RoleResource;
import com.hengaiw.model.User;
import com.hengaiw.service.ResourceService;
import com.hengaiw.commons.utils.Config;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.commons.result.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ResourceServiceImpl implements ResourceService {

    private static Logger LOGGER = LoggerFactory.getLogger(ResourceServiceImpl.class);

    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private ResourceMapper resourceMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleResourceMapper roleResourceMapper;

    @Override
    public List<Tree> findTree(User user) {
        List<Tree> trees = new ArrayList<Tree>();
        // 超级管理
        if (user.getLoginname().equals("admin")) {
            List<Resource> resourceFather = resourceMapper.findResourceAllByTypeAndPidNull(Config.RESOURCE_MENU);
            if (resourceFather == null) {
                return null;
            }

            for (Resource resourceOne : resourceFather) {
                Tree treeOne = new Tree();

                treeOne.setId(resourceOne.getId());
                treeOne.setText(resourceOne.getName());
                treeOne.setIconCls(resourceOne.getIcon());
                treeOne.setAttributes(resourceOne.getUrl());
                List<Resource> resourceSon = resourceMapper.findResourceAllByTypeAndPid(Config.RESOURCE_MENU, resourceOne.getId());

                if (resourceSon != null) {
                    List<Tree> tree = new ArrayList<Tree>();
                    for (Resource resourceTwo : resourceSon) {
                        Tree treeTwo = new Tree();
                        treeTwo.setId(resourceTwo.getId());
                        treeTwo.setText(resourceTwo.getName());
                        treeTwo.setIconCls(resourceTwo.getIcon());
                        treeTwo.setAttributes(resourceTwo.getUrl());
                        tree.add(treeTwo);
                    }
                    treeOne.setChildren(tree);
                } else {
                    treeOne.setState("closed");
                }
                trees.add(treeOne);
            }
            return trees;
        }

        // 普通用户
        Set<Resource> resourceIdList = new HashSet<Resource>();
        List<Long> roleIdList = userRoleMapper.findRoleIdListByUserId(user.getId());
        for (Long i : roleIdList) {
            List<Resource> resourceIdLists = roleMapper.findResourceIdListByRoleIdAndType(i);
            for (Resource resource: resourceIdLists) {
                resourceIdList.add(resource);
            }
        }
        for (Resource resource : resourceIdList) {
                if (resource != null && resource.getPid() == null) {
                    Tree treeOne = new Tree();
                    treeOne.setId(resource.getId());
                    treeOne.setText(resource.getName());
                    treeOne.setIconCls(resource.getIcon());
                    treeOne.setAttributes(resource.getUrl());
                    List<Tree> tree = new ArrayList<Tree>();
                    for (Resource resourceTwo : resourceIdList) {
                        if (resourceTwo.getPid() != null && resource.getId().longValue() == resourceTwo.getPid().longValue()) {
                            Tree treeTwo = new Tree();
                            treeTwo.setId(resourceTwo.getId());
                            treeTwo.setText(resourceTwo.getName());
                            treeTwo.setIconCls(resourceTwo.getIcon());
                            treeTwo.setAttributes(resourceTwo.getUrl());
                            tree.add(treeTwo);
                        }
                    }
                    treeOne.setChildren(tree);
                    trees.add(treeOne);
                }
        }
        return trees;
    }

    @Override
    public List<Resource> findResourceAll() {
        return resourceMapper.findResourceAll();
    }
//    @Override
//    public void findResourceAll(PageInfo pageInfo) {
//    	pageInfo.setRows(resourceMapper.findResourcePageCondition(pageInfo));
//    	pageInfo.setTotal(resourceMapper.findResourcePageCount(pageInfo));
//    }
    @Override
    public void findDataGrid(HaPageInfo pageInfo) {
    	List<Resource> resources = resourceMapper.findResourcePageCondition(pageInfo);
    	List<Resource> res = new ArrayList<Resource>();
    	for(Resource r : resources){
    		if(0 == r.getPid()){
    			r.setDescription("无父级");
    		}else{
	    		Resource res2 = findResourceById(r.getPid());
	    		r.setDescription(res2.getName());
    		}
    		res.add(r);
    	}
    	pageInfo.setRows(res);
    	pageInfo.setTotal(resourceMapper.findResourcePageCount(pageInfo));
    }

    @Override
    public void addResource(Resource resource) {
        resourceMapper.insert(resource);
    }
    @Override
    public void roleResource(List<String> resourceIds, String roleId) {
    	RoleResource roleResource = new  RoleResource();
    	for (String resourceId : resourceIds) {
    		roleResource.setResourceId(Long.valueOf(resourceId));
    		roleResource.setRoleId(Long.valueOf(roleId));
    		roleResourceMapper.insert(roleResource);
    	}
    }
    @Override
    public List<Tree> findAllTree() {
        List<Tree> trees = new ArrayList<Tree>();
        // 查询所有的一级树
        List<Resource> resources = resourceMapper.findResourceAllByTypeAndPidNull(Config.RESOURCE_MENU);
        if (resources == null) {
            return null;
        }
        for (Resource resourceOne : resources) {
            Tree treeOne = new Tree();

            treeOne.setId(resourceOne.getId());
            treeOne.setText(resourceOne.getName());
            treeOne.setIconCls(resourceOne.getIcon());
            treeOne.setAttributes(resourceOne.getUrl());
            // 查询所有一级树下的菜单
            List<Resource> resourceSon = resourceMapper.findResourceAllByTypeAndPid(Config.RESOURCE_MENU, resourceOne.getId());

            if (resourceSon != null) {
                List<Tree> tree = new ArrayList<Tree>();
                for (Resource resourceTwo : resourceSon) {
                    Tree treeTwo = new Tree();
                    treeTwo.setId(resourceTwo.getId());
                    treeTwo.setText(resourceTwo.getName());
                    treeTwo.setIconCls(resourceTwo.getIcon());
                    treeTwo.setAttributes(resourceTwo.getUrl());
                    tree.add(treeTwo);
                }
                treeOne.setChildren(tree);
            } else {
                treeOne.setState("closed");
            }
            trees.add(treeOne);
        }
        return trees;
    }

    @Override
    public List<Tree> findAllTrees() {
        List<Tree> treeOneList = new ArrayList<Tree>();

        // 查询所有的一级树
        List<Resource> resources = resourceMapper.findResourceAllByTypeAndPid(Config.RESOURCE_MENU,(long)0);
        if (resources == null) {
            return null;
        }

        for (Resource resourceOne : resources) {
            Tree treeOne = new Tree();

            treeOne.setId(resourceOne.getId());
            treeOne.setText(resourceOne.getName());
            treeOne.setIconCls(resourceOne.getIcon());
            treeOne.setAttributes(resourceOne.getUrl());

            List<Resource> resourceSon = resourceMapper.findResourceAllByTypeAndPid(Config.RESOURCE_MENU, resourceOne.getId());

            if (resourceSon == null) {
                treeOne.setState("closed");
            } else {
                List<Tree> treeTwoList = new ArrayList<Tree>();

                for (Resource resourceTwo : resourceSon) {
                    Tree treeTwo = new Tree();

                    treeTwo.setId(resourceTwo.getId());
                    treeTwo.setText(resourceTwo.getName());
                    treeTwo.setIconCls(resourceTwo.getIcon());
                    treeTwo.setAttributes(resourceTwo.getUrl());

                    /***************************************************/
                    List<Resource> resourceSons = resourceMapper.findResourceAllByTypeAndPid(Config.RESOURCE_BUTTON, resourceTwo.getId());

                    if (resourceSons == null) {
                        treeTwo.setState("closed");
                    } else {
                        List<Tree> treeThreeList = new ArrayList<Tree>();

                        for (Resource resourceThree : resourceSons) {
                            Tree treeThree = new Tree();

                            treeThree.setId(resourceThree.getId());
                            treeThree.setText(resourceThree.getName());
                            treeThree.setIconCls(resourceThree.getIcon());
                            treeThree.setAttributes(resourceThree.getUrl());

                            treeThreeList.add(treeThree);
                        }
                        treeTwo.setChildren(treeThreeList);
                    }
                    /***************************************************/

                    treeTwoList.add(treeTwo);
                }
                treeOne.setChildren(treeTwoList);
            }

            treeOneList.add(treeOne);
        }
        return treeOneList;
    }

    @Override
    public void updateResource(Resource resource) {
        int update = resourceMapper.updateResource(resource);
        if (update != 1) {
            throw new RuntimeException("更新失败");
        }
    }

    @Override
    public Resource findResourceById(Long id) {
        return resourceMapper.findResourceById(id);
    }

    @Override
    public void deleteResourceById(Long id) {
        int delete = resourceMapper.deleteResourceById(id);
        if (delete != 1) {
            throw new RuntimeException("删除失败");
        }
    }
    
    @Override
    public Resource findResourceBypid(Long pid) {
    	return resourceMapper.findResourceBypid(pid);
    }
	

}
