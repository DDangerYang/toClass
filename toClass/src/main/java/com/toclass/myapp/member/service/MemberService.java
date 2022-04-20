package com.toclass.myapp.member.service;

import com.toclass.myapp.member.vo.MemberVO;

public interface MemberService {

	// url요청에 따라 적절한 컨트롤러가 호출되면, 컨트롤러를 해당 요청을 처리하기 위해 service 객체에 의존하게 된다.
	// 즉, 비즈니스 로직 구현 자체는 service 객체가 담당하게 된다.
	public MemberVO login(MemberVO memberVO) throws Exception;
	
}
