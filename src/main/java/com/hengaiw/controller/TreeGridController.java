package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/treegrid")
public class TreeGridController extends BaseController {

  
    
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String manager() {
    	
    	return "admin/index";
    }

    

}
