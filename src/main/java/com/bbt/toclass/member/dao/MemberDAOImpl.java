package com.bbt.toclass.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.bbt.toclass.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOImpl.class);
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public MemberVO loginByEmail(MemberVO member) throws DataAccessException{
		MemberVO vo = sqlSession.selectOne("mapper.member.loginByEmail", member);
		return vo;
	}
	
	@Override
	public int checkEmailDuplicate(MemberVO member) throws DataAccessException{
		logger.info("myBatis에게 이메일 중복 확인 쿼리 요청 : " + member.getMember_email());
		int result = sqlSession.selectOne("mapper.member.checkEmailDuplicate", member);
		logger.info("myBatis로부터 성공적으로 응답 수신");
		logger.info("result : " + result);
		return result;
	}
	
	@Override
	public int register(MemberVO member) throws DataAccessException{
		logger.info("myBatis에게 회원정보 등록 쿼리 요청 : " + member.getMember_email());
		int result = sqlSession.insert("mapper.member.register", member);
		logger.info("myBatis로부터 성공적으로 응답 수신");
		logger.info(result + "개의 회원 레코드 추가");
		return result;
	}
	
}
