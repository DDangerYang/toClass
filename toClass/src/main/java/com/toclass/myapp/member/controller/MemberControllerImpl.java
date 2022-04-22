package com.toclass.myapp.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.toclass.myapp.member.service.MemberService;
import com.toclass.myapp.member.vo.MemberVO;

@Controller("memberController")
public class MemberControllerImpl implements MemberController {
	
	// 의존성 주입
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberVO memberVO;
	
	/*
	 * 
	 *  
	 *  뷰 페이지 매핑
	 *  
	 *  
	 */
	
	// 로그인 페이지(/member/login.jsp)
	@RequestMapping(value = { "/","/loginForm"}, method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("/member/login");
		if (RequestContextUtils.getInputFlashMap(request) != null) {
			Map<String, ?> redirectMap = RequestContextUtils.getInputFlashMap(request);
			String result = (String)redirectMap.get("result");
			mav.addObject("result", result);
		}
		return mav;
	}

	// 아이디 찾기 페이지(/member/findId.jsp)
	@RequestMapping(value = "/member/findIdForm", method = RequestMethod.GET)
	public String findIdForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/member/findId";
	}
		
	// 비밀번호 찾기 페이지(/member/findPw.jsp)
	@RequestMapping(value = "/member/findPwForm", method = RequestMethod.GET)
	public String findPwForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/member/findPw";
	}
	
	
	
	
	// 회원가입 페이지 : 0단계(/member/register_0.jsp)
	@RequestMapping(value = "/member/registerForm/0", method = RequestMethod.GET)
	public String registerForm0(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/member/register_0";
	}
	
	// 회원가입 페이지 : 1단계(/member/register_1.jsp)
	@RequestMapping(value = "/member/registerForm/1", method = RequestMethod.GET)
	public String registerForm1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/member/register_1";
	}
	
	// 회원가입 페이지 : 2단계(/member/register_2.jsp)
	@RequestMapping(value = "/member/registerForm/2", method = RequestMethod.GET)
	public String registerForm2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/member/register_2";
	}
	
	// 회원가입 페이지 : 3단계(/member/register_3.jsp)
	@RequestMapping(value = "/member/registerForm/3", method = RequestMethod.GET)
	public String registerForm3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/member/register_3";
	}
	
	
	
	
	
	
	
	/*
	 * 
	 *  
	 *  로직 구현
	 *  
	 *  
	 */
	
	// 로그인 버튼 : 로그인 요청
	@Override
	@RequestMapping(value = "/member/login.do", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute MemberVO member,
				              RedirectAttributes rAttr, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		memberVO = memberService.login(member);
		
		// 입력된 id&pw값과 일치하는 회원 존재할 시
		if(memberVO != null) {
		    HttpSession session = request.getSession();
		    session.setAttribute("member", memberVO);
		    mav.setViewName("test");
		}
		
		// 입력된 id&pw값과 일치하는 회원 존재하지 않을 시
		else {
		   rAttr.addFlashAttribute("result","loginFailed");
	       mav.setViewName("redirect:/loginForm");	
		}
		
	return mav;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
