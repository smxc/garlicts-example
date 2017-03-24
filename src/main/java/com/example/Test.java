package com.example;

import com.example.controller.StaticController;

public class Test {

	public static void main(String[] args) {

		Class cls = StaticController.class;
		System.out.println(cls.getName());
//		System.out.println(cls.getPackage() + "." + cls.getSimpleName());
		
	}

}
