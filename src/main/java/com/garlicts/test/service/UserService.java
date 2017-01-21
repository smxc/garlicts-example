package com.garlicts.test.service;

import java.util.List;

import com.garlicts.dao.JdbcTemplate;
import com.garlicts.ioc.annotation.Autowired;
import com.garlicts.ioc.annotation.Bean;
import com.garlicts.test.entity.User;

@Bean
public class UserService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> getUserList() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from user");
		List<User> userList = jdbcTemplate.queryEntityList(User.class, sql.toString(), null);
		return userList;
	}

}
