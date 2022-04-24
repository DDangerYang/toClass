package com.bbt.toclass.member.dao;

import org.springframework.dao.DataAccessException;

import com.bbt.toclass.member.vo.MemberVO;

public interface MemberDAO {

	public MemberVO loginByEmail(MemberVO member) throws DataAccessException;
	
	public int checkEmailDuplicate(MemberVO member) throws DataAccessException;
	
	public int register(MemberVO member) throws DataAccessException;
	
}
