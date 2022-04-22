package com.toclass.myapp.achievement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("achievementController")
public class AchievementControllerlmpl implements AchievementController {

	@RequestMapping("/achievement")
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test");//test 를 불러와줘
		mav.addObject("name", "reto");//name이 있다면 거기에 reto를 넣어서,(achievement_stu..에있다)
		return mav;
	}

	
//	
}
