package com.garlicts.test.controller;

import java.util.HashMap;
import java.util.Map;

import com.garlicts.mvc.annotation.Controller;
import com.garlicts.mvc.annotation.RequestMapping;
import com.garlicts.mvc.bean.JspView;

@Controller
public class StaticController {

	@RequestMapping(value="/staticV")
	public JspView staticV(){

		Map<String, Object> rs = new HashMap<String,Object>();
		JspView jspView = new JspView();
		
		jspView.setView("static.jsp");
		rs.put("ret", "success");
		jspView.setModel(rs);
		
		return jspView;
		
	}
	
	@RequestMapping(value="/staticV2")
	public JspView staticV2(){

		Map<String, Object> rs = new HashMap<String,Object>();
		JspView jspView = new JspView();
		
		jspView.setView("/1.jsp");
		rs.put("ret", "success");
		jspView.setModel(rs);
		
		return jspView;
		
	}	
	
}
