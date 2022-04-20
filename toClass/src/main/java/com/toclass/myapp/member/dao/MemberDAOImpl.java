package com.toclass.myapp.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.toclass.myapp.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	// 원래대로라면, DB와 통신하는 dao클래스는 드라이버 클래스 로드, 커넥션 생성, 쿼리문 prepare 등등 할일이 많다.
	// 하지만 우리는 orm인 myBatis와 spring-jdbc를 사용하기에 많은 부분이 생략된다.
	// 우선, db관련 연결 정보는 WEB-INF의 config폴더에 있는 jdbc.properties에 정의되어있으며, 해당 설정파일에 대한 매핑은 action-mybatis.xml에 정의되어있다.
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException{
		  MemberVO vo = sqlSession.selectOne("mapper.member.loginById", memberVO);
		return vo;
	}
	
}
