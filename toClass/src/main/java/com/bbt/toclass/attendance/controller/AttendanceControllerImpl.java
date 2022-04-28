package com.bbt.toclass.attendance.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bbt.toclass.attendance.service.AttendanceService;
import com.bbt.toclass.attendance.vo.AttendanceVO;
import com.bbt.toclass.member.vo.MemberVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller("attendanceController")
@RequestMapping("/attendance/*")
public class AttendanceControllerImpl implements AttendanceController {
	private static final Logger logger = LoggerFactory.getLogger(AttendanceController.class);
	
	@Autowired
	private AttendanceService attendanceService;
	@Autowired
	private AttendanceVO attendanceVO;
	@Autowired
	private MemberVO memberVO;
	
	//출석페이지 
	@RequestMapping(value = "/attendance_teacher", method = RequestMethod.GET)
	public String teacherAttendPage(Model model, MemberVO memberVO, AttendanceVO attendanceVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		logger.info("주간 날짜 가져오기");
		ArrayList<String> week = WeekDay();
		request.setAttribute("week", week.get(0));
		request.setAttribute("week1", week.get(1));
		request.setAttribute("week2", week.get(2));
		request.setAttribute("week3", week.get(3));
		request.setAttribute("week4", week.get(4));
		//model.addAttribute("attendList",attendanceService.attendList(memberVO));
		
		logger.info("오늘날짜 가져오기");
		String t_day = toDay();
		request.setAttribute("t_day", t_day);
		
//		logger.info("출석 정보 가져오기");
//		List<AttendanceVO> attendList = attendanceService.attendList(memberVO);
//		model.addAttribute("attendList",attendList);
		
		return "attendance/attendance_teacher";
	}
	
	
	
	//오늘 날짜를 기준으로 월~금의 날짜 가져와서 arraylist에 값 넣기 
	private ArrayList<String> WeekDay() {
		
		//오늘날짜
		SimpleDateFormat sdf = new SimpleDateFormat("MM.dd",Locale.KOREAN);
		String time = sdf.format(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		ArrayList<String> day = new ArrayList<String>();
		for(int i=2;i<7;i++) {
			cal.add(Calendar.DATE, i- cal.get(Calendar.DAY_OF_WEEK));
			String w_day = sdf.format(cal.getTime());
			day.add(w_day);
			//cal.add(Calendar.DATE, 6- cal.get(Calendar.DAY_OF_WEEK));
			//return sdf.format(cal.getTime());			
		}
		System.out.println(day);
		return day;

	}
	
	//오늘 날짜 가져오기
			private String toDay() {
				LocalDate now = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M월 d일 (E)");
				String formatedNow = now.format(formatter);
				System.out.println(formatedNow);
				return formatedNow;
			}
	
}











