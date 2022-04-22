package com.toclass.myapp.member.dao;

import org.springframework.dao.DataAccessException;

import com.toclass.myapp.member.vo.MemberVO;

public interface MemberDAO {

	// DAO클래스는 DB와 직접 소통하는, 이름그대로 DataAccess를 하는 객체이기에 해당 예외처리를 해줘야만 한다.
	 public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	
}
