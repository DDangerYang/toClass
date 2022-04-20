package com.toclass.myapp.attendance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public interface AttendanceController {
	
	//attendance 홈페이지로 이동할 때
	public String noticeget(HttpServletRequest request, Model model) throws Exception;
		

	
}
