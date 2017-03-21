//package com.example.service;
//
//import java.util.List;
//
//import com.example.entity.User;
//import com.garlicts.framework.dao.JdbcTemplate;
//import com.garlicts.framework.ioc.annotation.Autowired;
//import com.garlicts.framework.ioc.annotation.Bean;
//
//@Bean
//public class UserService {
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	public List<User> getUserList() {
//		StringBuffer sql = new StringBuffer();
//		sql.append("select * from user");
//		List<User> userList = jdbcTemplate.queryEntityList(User.class, sql.toString(), null);
//		return userList;
//	}
//	
//	public void printUserInfo() {
//		System.out.println("printUserInfo...");
//	}
//
//}
