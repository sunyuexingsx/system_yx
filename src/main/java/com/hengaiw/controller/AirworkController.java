package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.service.Dm_express_carsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description：货检作业
 * @author：zjh
 * @date：2016-09-14
 */
@Controller
@RequestMapping("/airwork")
public class AirworkController extends BaseController {

    @Autowired
    private Dm_express_carsService dmexpresscarsService;
    
    /**
     * 货检作业管理页
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String manager() {
    	
    	return "admin/airwork";
    }

    /**
     * 货检作业管理页
     *
     * @return
     */
    @RequestMapping(value = "/listData", method = RequestMethod.POST)
    @ResponseBody
    public Object listData(QcworkVo workVo, Integer page, Integer rows, String sort, String order) {
    	HaPageInfo pageInfo = new HaPageInfo(page, rows);
    	dmexpresscarsService.findAirworkList(pageInfo);
    	return pageInfo;
    }

    

}
