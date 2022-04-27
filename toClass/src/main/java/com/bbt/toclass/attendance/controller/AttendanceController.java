package com.bbt.toclass.attendance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.bbt.toclass.attendance.vo.AttendanceVO;
import com.bbt.toclass.member.vo.MemberVO;

public interface AttendanceController {
	
	//출석 체크 페이지
	public String teacherAttendPage(Model model,  MemberVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	
//	//로그인된 계정의 비밀번호와 일치하는지 검증
//	public void teacherCheckDo(String member_pw, HttpServletResponse response) throws Exception;
	
	//
	
	
}