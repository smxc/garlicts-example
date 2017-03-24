package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.User;
//import com.example.service.UserService;
import com.garlicts.framework.ioc.annotation.Autowired;
import com.garlicts.framework.mvc.GarlictsContext;
import com.garlicts.framework.mvc.annotation.Controller;
import com.garlicts.framework.mvc.annotation.RequestMapping;
import com.garlicts.framework.mvc.bean.JsonView;
import com.garlicts.framework.mvc.bean.JspView;
import com.garlicts.framework.plugin.cache.redis.RedisTemplate;

@Controller
public class UserController {

//	@Autowired
//	UserService userService;
	@Autowired
	RedisTemplate redisTemplate;
	
//	@RequestMapping(value="/userList")
//	public JspView getUserList(){
//		
//		JspView jspView = new JspView();
//		Map<String,Object> map = new HashMap<String,Object>();
//		
//		List<User> userList = userService.getUserList();
//		
//		map.put("list", userList);
//		jspView.setModel(map);
//		jspView.setView("userList.jsp");
//		System.out.println(userList);
//		
//		return jspView;
//	}
	
//	@RequestMapping(value="/userListJson")
//	public JsonView userListJson(){
//		JsonView jsonView = new JsonView();
//		Map<String,Object> map = new HashMap<String,Object>();	
//		
//		List<User> userList = userService.getUserList();
//		map.put("list", userList);
//		jsonView.setModel(map);
//		
//		return jsonView;
//		
//	}
	
	/**
	 * 测试redis缓存 
	 */
	@RequestMapping("/redis/test")
	public JspView redis(){
		JspView jspView = new JspView();
		Map<String, Object> map = new HashMap<String, Object>();
		
		redisTemplate.put("key1", "100");
		String value = redisTemplate.get("key1");
		map.put("a", value);
		
		jspView.setView("redis.jsp");
		jspView.setModel(map);
		
		return jspView;
		
	}
	
//	/**
//	 * 获取所有form提交的参数 
//	 */
//	@RequestMapping("/user/submitUser")
//	public JspView submitUser(){
//		JspView jspView = new JspView();
//		Map<String, Object> paramsMap = GarlictsContext.Request.get("params");
//		jspView.setView("1.jsp");
//		jspView.setModel(paramsMap);
//		return jspView;
//	}

}
