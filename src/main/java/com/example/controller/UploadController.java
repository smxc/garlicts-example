package com.example.controller;

import com.garlicts.framework.mvc.annotation.Controller;
import com.garlicts.framework.mvc.annotation.RequestMapping;
import com.garlicts.framework.mvc.bean.JspView;

@Controller
public class UploadController {

	@RequestMapping("/upload")
	public JspView upload(){
		JspView jspView = new JspView();
		
		jspView.setView("upload.jsp");
		return jspView;
	}
	
}
