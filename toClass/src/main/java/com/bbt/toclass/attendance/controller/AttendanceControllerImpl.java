package com.bbt.toclass.attendance.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Controller("attendanceController")
@RequestMapping("/attendance/*")
public class AttendanceControllerImpl implements AttendanceController {
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
	
	//출석 체크 페이지
	@RequestMapping(value = "/attendance_teacher", method = RequestMethod.GET)
	public String teacherPage(Model model, HttpServletRequest request, HttpServletResponse response) {
		logger.info("get/attendance/check");
//		String monday = startWeek();
//		System.out.println(monday);
//		String friday = endWeek();
//		System.out.println(friday);
		ArrayList<String> week = WeekDay();
		System.out.println(week);
		
		return "attendance/attendance_teacher";
	}
	
	
	private String startWeek() {			
		//현재 날짜를 기준으로 월요일 날짜 알려주는 함수		
		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd",Locale.KOREAN);
		//String time = sdf.format(System.currentTimeMillis());
		//System.out.println(time);
		//Date date = new Date();
		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		cal.add(Calendar.DATE, 2- cal.get(Calendar.DAY_OF_WEEK));
		return sdf.format(cal.getTime());
	}
	
	private String endWeek() {
		//현재 날짜를 기준으로 금요일 날짜 알려주는 함수
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd",Locale.KOREAN);
		//String time = sdf.format(System.currentTimeMillis());
		//System.out.println(time);
		//Date date = new Date();
		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		cal.add(Calendar.DATE, 6- cal.get(Calendar.DAY_OF_WEEK));
		return sdf.format(cal.getTime());

	}
	
	private ArrayList<String> WeekDay() {
		
		//오늘날짜
		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd",Locale.KOREAN);
		String time = sdf.format(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		ArrayList<String> day = new ArrayList<String>();
		for(int i=2;i<7;i++) {
			cal.add(Calendar.DATE, i- cal.get(Calendar.DAY_OF_WEEK));
			String a_day = sdf.format(cal.getTime());
			day.add(a_day);
			//cal.add(Calendar.DATE, 6- cal.get(Calendar.DAY_OF_WEEK));
			//return sdf.format(cal.getTime());			
		}
		System.out.println(day);
		return day;

	}
	
}
