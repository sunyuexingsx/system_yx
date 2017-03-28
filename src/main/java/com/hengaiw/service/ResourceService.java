package com.hengaiw.service;

import com.hengaiw.model.Resource;
import com.hengaiw.model.Role;
import com.hengaiw.model.User;
import com.hengaiw.commons.result.Tree;
import com.hengaiw.commons.utils.HaPageInfo;

import java.util.List;

/**
 * @description：资源管理
 * @author：hengaiw.com
 * @date：2016-09-11
 */
public interface ResourceService {

    /**
     * 根据用户查询树形菜单列表
     *
     * @param currentUser
     * @return
     */
    List<Tree> findTree(User currentUser);

    /**
     * 查询所有资源
     *
     * @return
     */
    List<Resource> findResourceAll();
 //   void findResourceAll(PageInfo pageInfo);
    void findDataGrid(HaPageInfo pageInfo);
    /**
     * 添加资源
     *
     * @param resource
     */
    void addResource(Resource resource);
    
    void roleResource(List<String> resourceIds, String roleId);

    /**
     * 查询二级数
     *
     * @return
     */
    List<Tree> findAllTree();

    /**
     * 查询三级数
     *
     * @return
     */
    List<Tree> findAllTrees();

    /**
     * 更新资源
     *
     * @param resource
     */
    void updateResource(Resource resource);

    /**
     * 根据id查询资源
     *
     * @param id
     * @return
     */
    Resource findResourceById(Long id);

    /**
     * 根据id删除资源
     *
     * @param id
     */
    void deleteResourceById(Long id);
    
   
    Resource findResourceBypid(Long pid);
}
