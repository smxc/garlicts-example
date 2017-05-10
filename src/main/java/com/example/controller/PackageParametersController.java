package com.example.controller;

import com.example.entity.Pager;
import com.example.entity.User;
import com.garlicts.framework.mvc.annotation.Controller;
import com.garlicts.framework.mvc.annotation.RequestMapping;
import com.garlicts.framework.mvc.bean.JsonView;

/**
 * 将接受的所有参数封装到控制器方法的实参中 
 */
@Controller
public class PackageParametersController {

	@RequestMapping("/params/submitUser")
	public JsonView submitUser(User user, Pager pager){
		
		JsonView jsonView = new JsonView();
		System.out.println("user.name: " + user.getName() + " | user.mobile: " + user.getMobile());
		System.out.println("pager.rows: " + pager.getRows() + " | pager.page: " + pager.getPage());
		return jsonView;
	}
	
}
