package com.garlicts.test.controller;

import com.garlicts.mvc.annotation.Controller;
import com.garlicts.mvc.annotation.RequestMapping;
import com.garlicts.mvc.bean.JspView;

@Controller
public class UploadController {

	@RequestMapping("/upload")
	public JspView upload(){
		JspView jspView = new JspView();
		
		jspView.setView("upload.jsp");
		return jspView;
	}
	
}
