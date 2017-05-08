package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

import com.example.entity.Pager;
import com.example.entity.User;
//import com.example.service.UserService;
import com.garlicts.framework.ioc.annotation.Autowired;
import com.garlicts.framework.mvc.GarlictsContext;
import com.garlicts.framework.mvc.annotation.Controller;
import com.garlicts.framework.mvc.annotation.RequestMapping;
import com.garlicts.framework.mvc.bean.JsonView;
import com.garlicts.framework.mvc.bean.JspView;
import com.garlicts.framework.plugin.cache.redis.JedisTemplate;

@Controller
public class UserController {

//	@Autowired
//	UserService userService;
//	@Autowired
//	RedisTemplate redisTemplate;
	
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
//	@RequestMapping("/redis/test")
//	public JspView redis(){
//		JspView jspView = new JspView();
//		Map<String, Object> map = new HashMap<String, Object>();
//		
////		redisTemplate.put("key1", "100");
////		String value = redisTemplate.get("key1");
//		
//		Jedis jedis = JedisTemplate.getJedis();
//		jedis.set("key1", "100");
//		String value = jedis.get("key1");
//		map.put("a", value);
//		
//		jspView.setView("redis.jsp");
//		jspView.setModel(map);
//		
//		jedis.close();
//		
//		return jspView;
//		
//	}
	
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
	
	@RequestMapping("/user/submitUser")
	public JsonView submitUser(User user, Pager pager){
		
		JsonView jsonView = new JsonView();
		System.out.println("user.name: " + user.getName() + " user.mobile: " + user.getMobile());
		System.out.println("pager.rows: " + pager.getRows() + " pager.page: " + pager.getPage());
		return jsonView;
	}

}
