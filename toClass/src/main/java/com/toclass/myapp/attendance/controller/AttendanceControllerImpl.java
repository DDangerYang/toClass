package com.toclass.myapp.attendance.controller;

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

import com.toclass.myapp.attendance.service.AttendanceService;
import com.toclass.myapp.attendance.vo.AttendanceVO;
import com.toclass.myapp.member.vo.MemberVO;

@Controller("attendanceController")
public class AttendanceControllerImpl implements AttendanceController {
	
	@Autowired
	private AttendanceService attendanceService;
	
	
	private Logger logger = LoggerFactory.getLogger(AttendanceController.class);

	@RequestMapping(value = "/attendance", method = RequestMethod.GET)
	public String noticeget(HttpServletRequest request, Model model) throws Exception {
		logger.info("attend_get");
		
		HttpSession session = request.getSession();
		MemberVO memberVO = (MemberVO)session.getAttribute("member");
		model.addAttribute("type", memberVO.getType());
		
		AttendanceVO attendLast = attendanceService.attendLast(memberVO);
		return "attendance";
	}
}
