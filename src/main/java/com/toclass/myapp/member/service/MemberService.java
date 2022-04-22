package com.toclass.myapp.member.service;

import com.toclass.myapp.member.vo.MemberVO;

public interface MemberService {

	// 로그인
	public MemberVO login(MemberVO memberVO) throws Exception;
	
	// 인증번호 전송
	public void sendAuthCode(String authCode, String email);
}
