package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import com.hengaiw.commons.result.Tree;
import com.hengaiw.model.Organization;
import com.hengaiw.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @description：部门管理
 * @author：恒爱科技
 * @date：2016/09/01
 */
@Controller
@RequestMapping("/organization")
public class OrganizationController extends BaseController {

    @Autowired
    private OrganizationService organizationService;

    /**
     * 部门管理主页
     *
     * @return
     */
    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public String manager(Model model) {
    	List<Tree> mylist=organizationService.findTree();
    	model.addAttribute("list",mylist);
        return "admin/organization";
    }

    /**
     * 部门资源树
     *
     * @return
     */
    @RequestMapping(value = "/tree", method = RequestMethod.POST)
    @ResponseBody
    public Object tree() {
        return organizationService.findTree();
    }

    /**
     * 部门列表
     *
     * @return
     */
    @RequestMapping("/treeGrid")
    @ResponseBody
    public Object treeGrid() {
        return organizationService.findTreeGrid();
    }

    /**
     * 添加部门页
     *
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage() {
        return "admin/organizationAdd";
    }

    /**
     * 添加部门
     *
     * @param organization
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Object add(Organization organization) {
        organizationService.addOrganization(organization);
        return renderSuccess("添加成功！");
    }

    /**
     * 编辑部门页
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(HttpServletRequest request, Long id) {
        Organization organization = organizationService.findOrganizationById(id);
        request.setAttribute("organization", organization);
        return "admin/organizationEdit";
    }

    /**
     * 编辑部门
     *
     * @param organization
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Organization organization) {
        organizationService.updateOrganization(organization);
        return renderSuccess("编辑成功！");
    }

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Long id) {
        organizationService.deleteOrganizationById(id);
        return renderSuccess("删除成功！");
    }
}
