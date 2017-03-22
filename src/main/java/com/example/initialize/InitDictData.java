package com.example.initialize;

import com.example.service.MyService;
import com.garlicts.framework.InitializeData;
import com.garlicts.framework.ioc.annotation.Autowired;

public class InitDictData extends InitializeData {

	@Autowired
	MyService myService;
	
	@Override
	public void init() {
		myService.print();
	}

	@Override
	public void destroy() {
		
	}

}
