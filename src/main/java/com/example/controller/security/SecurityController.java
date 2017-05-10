package com.example.controller.security;

import com.garlicts.framework.mvc.annotation.Controller;
import com.garlicts.framework.mvc.annotation.RequestMapping;
import com.garlicts.framework.mvc.bean.JsonView;

@Controller
public class SecurityController {
	
	@RequestMapping("/security/getIp")
	public JsonView getIp(){
		
		JsonView jsonView = new JsonView();
		String str = "success";
		jsonView.setModel(str);
		return jsonView;
		
	}
	
}
