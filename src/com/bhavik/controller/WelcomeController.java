package com.bhavik.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class WelcomeController implements Controller{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		 Map<String,String> map = new HashMap<String,String>();
			map.put("name",name);
		ModelAndView view= new ModelAndView("success",map);	
		return view;
	}

}
