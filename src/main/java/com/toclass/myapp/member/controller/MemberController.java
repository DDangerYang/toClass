package com.toclass.myapp.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.toclass.myapp.member.vo.MemberVO;

public interface MemberController {

	// 페이지 매핑
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public String findIdForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public String findPwForm(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public String registerForm0(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public String registerForm1(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView registerForm2(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView registerForm3(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	// 로직
	public ModelAndView login(@ModelAttribute MemberVO member,
			RedirectAttributes rAttr, HttpServletRequest request, HttpServletResponse response) throws Exception;
	

	
	
	
	
	
	
	
	
	
	
}
