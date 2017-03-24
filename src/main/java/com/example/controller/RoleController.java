package com.example.controller;

import java.lang.reflect.Method;
import java.util.Map;

import com.garlicts.framework.mvc.annotation.Controller;
import com.garlicts.framework.mvc.annotation.RequestMapping;
import com.garlicts.framework.mvc.bean.JspView;
import com.garlicts.framework.security.AccessRightsAbility;
import com.garlicts.framework.security.annotation.Role;

@Controller
public class RoleController {

	/**
	 * 需要admin权限才可以访问 
	 */
	@RequestMapping("/role/test")
	@Role("admin")
	public JspView test(){
		
		String role = "user";
		JspView jspView = new JspView();
		
		Map<String, String> accessRightsMap = AccessRightsAbility.getAccessRightsMap();
		String key = "com.example.controller.RoleController.test";
		String rolename = accessRightsMap.get(key);
		if(!role.equals(rolename)){
			jspView.setView("role/refuse.jsp");
		}else{
			jspView.setView("role/test.jsp");
		}
		
		return jspView;
		
	}
	
}
