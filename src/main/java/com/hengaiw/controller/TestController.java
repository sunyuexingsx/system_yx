package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.service.Dc_ra_lineService;
import com.hengaiw.service.SlaveService;
import com.hengaiw.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description：测试Controller
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private SlaveService slaveService;
    @Autowired
    private Dc_ra_lineService dcralineService;
    /**
     * 主重库测试
     * @param model
     * @return
     */
    @RequestMapping(value = "/slave", method = RequestMethod.GET)
    public String slave(Model model) {
        Integer count = slaveService.count();
        model.addAttribute("count", count);
        return "admin/test";
    }

    /**
     * 图标测试
     * @return
     */
    @RequestMapping(value = "/dataGrid", method = RequestMethod.GET)
    public String dataGrid() {
        return "admin/test";
    }
    /**
     * 线路测试
     * @return
     */
    @RequestMapping(value = "/dcraline", method = RequestMethod.GET)
    public void dcraline() {
		HaPageInfo pageInfo = new HaPageInfo(1, 10);
		dcralineService.findDcRaLineList(pageInfo);
		System.out.println("ok");
    }
}
