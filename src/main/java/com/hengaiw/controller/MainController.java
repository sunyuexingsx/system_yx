package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description：部门管理
 * @author：恒爱科技
 * @date:2016/09/01
 */
@Controller
@RequestMapping("/main")
public class MainController extends BaseController {

   
    /**
     * 部门管理主页
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
    	
        return "main";
    }

    
}
