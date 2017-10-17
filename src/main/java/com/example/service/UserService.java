package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.User;
import com.garlicts.framework.ioc.annotation.Bean;

@Bean
public class UserService {

//	@Autowired
//	JdbcTemplate jdbcTemplate;
	
//	public List<User> getUserList() {
//		StringBuffer sql = new StringBuffer();
//		sql.append("select * from user");
//		List<User> userList = jdbcTemplate.queryEntityList(User.class, sql.toString(), null);
//		return userList;
//	}
	
//	public void printUserInfo() {
//		System.out.println("printUserInfo...");
//	}
	
	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("1", "a1", "a1"));
		userList.add(new User("2", "a2", "a2"));
		return userList;
	}

}
