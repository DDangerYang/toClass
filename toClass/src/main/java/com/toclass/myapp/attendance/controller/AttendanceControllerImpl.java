package com.toclass.myapp.attendance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toclass.myapp.attendance.service.AttendanceService;

@Controller("attendanceController")
@RequestMapping("/attendance/*")
public class AttendanceControllerImpl implements AttendanceController {
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
	@Autowired
	private AttendanceService attendanceService;
	
	//출석 체크 페이지
	@RequestMapping(value = "/attendance_teacher", method = RequestMethod.GET)
	public String getCheckPage(Model model, HttpServletRequest request, HttpServletResponse response) {
		logger.info("get/attendance/check");
		
		return "attendance/attendance_teacher";
	}

	
}
