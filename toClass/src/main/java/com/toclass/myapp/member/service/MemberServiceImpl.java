package com.toclass.myapp.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toclass.myapp.member.dao.MemberDAO;
import com.toclass.myapp.member.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	// 비즈니스 로직을 담당하는 service 객체는 DB와 직접적으로 상호작용을 DAO를 통해 기능을 처리한다.
	// 이에 따라 DAO클래스에 대한 의존성 주입을 해줘야만 한다.
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public MemberVO login(MemberVO memberVO) throws Exception{
		return memberDAO.loginById(memberVO);
	}
	
}
