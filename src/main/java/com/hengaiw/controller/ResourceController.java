package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import com.hengaiw.commons.result.Tree;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.model.Resource;
import com.hengaiw.model.User;
import com.hengaiw.service.ResourceService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description：资源管理
 * @author：hengaiw.com
 * @date：2016-09-18
 */
@Controller
@RequestMapping("/resource")
public class ResourceController extends BaseController {

    @Autowired
    private ResourceService resourceService;

    /**
     * 菜单树
     *
     * @return
     */
    @RequestMapping(value = "/tree", method = RequestMethod.POST)
    @ResponseBody
    public Object tree() {
        User currentUser = getCurrentUser();
        return resourceService.findTree(currentUser);
    }

    /**
     * 资源管理页
     *
     * @return
     */
    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public String manager(Model model) {
    	//获取资源列表
    	/*List<Tree> reslist=resourceService.findTree(getCurrentUser());*/
    	List<Tree> reslist=resourceService.findTree(getCurrentUser());
    	model.addAttribute("reslist",reslist);
    	
        return "admin/resource";
    }

    /**
     * 资源管理列表
     *
     * @return
     */
    @RequestMapping(value = "/treeGrid", method = RequestMethod.POST)
    @ResponseBody
    public Object treeGrid() {
        return resourceService.findResourceAll();
    }
    
    @RequestMapping(value = "/dataGrid", method = RequestMethod.POST)
    @ResponseBody
    public Object dataGrid(Integer page, Integer rows, String sort, String order) {
        HaPageInfo pageInfo = new HaPageInfo(page, rows, sort, order);
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        resourceService.findDataGrid(pageInfo);
        return pageInfo;
    }
    /**
     * 添加资源页
     *
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "/admin/resourceAdd";
    }

    /**
     * 添加资源
     *
     * @param resource
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Object add(Resource resource) {
        resourceService.addResource(resource);
        return renderSuccess("添加成功！");
    }
    
    @RequestMapping("/roleResource")
    @ResponseBody
    public Object roleResource(String resourceIds, String roleId) {
    	List<String> idList = new ArrayList<String>();
    	String[] ids = resourceIds.split(",");
    	Collections.addAll (idList, ids);
        resourceService.roleResource(idList, roleId);
        return renderSuccess("添加成功！");
    }

    /**
     * 二级资源树
     *
     * @return
     */
    @RequestMapping("/allTree")
    @ResponseBody
    public Object allTree() {
        return resourceService.findAllTree();
    }

    /**
     * 三级资源树
     *
     * @return
     */
    @RequestMapping(value = "/allTrees", method = RequestMethod.POST)
    @ResponseBody
    public Object allTrees() {
        return resourceService.findAllTrees();
    }

    /**
     * 编辑资源页
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(Model model, Long id) {
        Resource resource = resourceService.findResourceById(id);
        model.addAttribute("resource", resource);
        return "/admin/resourceEdit";
    }

    /**
     * 编辑资源
     *
     * @param resource
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Resource resource) {
        resourceService.updateResource(resource);
        return renderSuccess("编辑成功！");
    }

    /**
     * 删除资源
     *
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Long id) {
        resourceService.deleteResourceById(id);
        return renderSuccess("删除成功！");
    }
    
    @RequestMapping("/pid")
    @ResponseBody
    public Resource pid(Long pid) {
        Resource resource = resourceService.findResourceBypid(pid);
        return resource;
    }

}
