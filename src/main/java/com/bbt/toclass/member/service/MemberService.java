package com.bbt.toclass.member.service;

import com.bbt.toclass.member.vo.MemberVO;

public interface MemberService {

	// 로그인
	MemberVO login(MemberVO member) throws Exception;
	
	// 인증번호 전송
	void sendAuthCode(String authCode, String email) throws Exception;

	// 이메일 중복확인
	String checkEmailDuplicate(MemberVO member) throws Exception;
	
	// 회원가입(DB에 등록)
	boolean register(MemberVO member) throws Exception;
}
