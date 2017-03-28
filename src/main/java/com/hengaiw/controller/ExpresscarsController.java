package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import com.hengaiw.commons.result.QcworkVo;
import com.hengaiw.commons.utils.HaPageInfo;
import com.hengaiw.service.Dm_express_carsService;
import com.hengaiw.service.Dm_td_traService;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description：现车信息
 * @author：zjh
 * @date：2016-09-14
 */
@Controller
@RequestMapping("/expressscars")
public class ExpresscarsController extends BaseController {

    @Autowired
    private Dm_express_carsService dmexpresscarsService;
    @Autowired
    private Dm_td_traService dmtdtraService;
    /**
     * 现车信息管理页
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String manager() {
    	
    	return "admin/express_cars";
    }

    /**
     * 现车信息异步加载
     *
     * @return
     */
    @RequestMapping(value = "/listData", method = RequestMethod.POST)
    @ResponseBody
    public Object listData(QcworkVo workVo, Integer page, Integer rows, String sort, String order) {
    	
    	HaPageInfo pageInfo = new HaPageInfo(page, rows,sort,order);
    	Map<String, Object> condition = new HashMap<String, Object>();
        if (StringUtils.isNoneBlank(workVo.getcTraNum())) {
            condition.put("cTraNum", workVo.getcTraNum());
        }
        if (workVo.geteSymArrdep()!=null && workVo.geteSymArrdep()>0) {
            condition.put("eSymArrdep", workVo.geteSymArrdep());
        }
        if (workVo.getiLineIdArrdep()!=null && workVo.getiLineIdArrdep()>0) {
            condition.put("iLineIdArrdep", workVo.getiLineIdArrdep());
        }
        if (workVo.getdFaNotify_begin()!=null && workVo.getdFaNotify_end()!=null) {
            condition.put("dFaNotify_begin", workVo.getdFaNotify_begin());
            condition.put("dFaNotify_end", workVo.getdFaNotify_end());
        }
        pageInfo.setCondition(condition);
    	dmtdtraService.findQcworkList(pageInfo);
    	return pageInfo;
    }

    

}
