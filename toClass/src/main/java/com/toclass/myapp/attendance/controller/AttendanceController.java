package com.toclass.myapp.attendance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.toclass.myapp.attendance.vo.AttendanceVO;

public interface AttendanceController {
	
	//출석 체크 페이지
	public String getCheckPage(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception;
		
	
	
}
