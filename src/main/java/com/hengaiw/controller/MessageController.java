package com.hengaiw.controller;

import com.hengaiw.commons.base.BaseController;
import com.hengaiw.commons.result.UserVo;
import com.hengaiw.model.Organization;
import com.hengaiw.model.User;
import com.hengaiw.model.message;
import com.hengaiw.service.MessageService;
import com.hengaiw.service.OrganizationService;
import com.hengaiw.service.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/message")
public class MessageController extends BaseController {
	@Autowired
	private UserService userService;	
	@Autowired
	private MessageService messageService;
    /**
     * 班工作重点信息页
     *
     * @return
     */
    @RequestMapping(value = "/manager", method = RequestMethod.GET)
    public String manager() {
    	
    	return "admin/message";
    }
    
    @RequestMapping("/add")
    @ResponseBody
    public Object add(String message) {
    	String[ ] idlist = message.split(",");
    	message mes = new message();
    	for (String id : idlist) {
    		mes.setToOrgId(id);
    		List <UserVo> userlist = userService.findUserByOrganizationId(Long.valueOf(id));
    		for (UserVo userVo : userlist) {
    			mes.setToMemberId(""+userVo.getId());
    			messageService.insertMessage(mes);
			}
		}
        return renderSuccess("添加成功");
    }
    
  
}
