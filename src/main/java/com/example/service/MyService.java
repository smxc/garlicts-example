package com.example.service;

import com.garlicts.framework.ioc.annotation.Bean;

@Bean
public class MyService {

	public void print(){
		System.out.println(MyService.class.getName());
	}
	
}
