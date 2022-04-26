package com.bbt.toclass.attendance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.bbt.toclass.attendance.vo.AttendanceVO;

public interface AttendanceController {
	
	//출석 체크 페이지
	public String teacherPage(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	
	
	
}
