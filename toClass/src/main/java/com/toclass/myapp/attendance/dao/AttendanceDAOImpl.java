package com.toclass.myapp.attendance.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.toclass.myapp.attendance.vo.AttendanceVO;
import com.toclass.myapp.member.vo.MemberVO;

@Repository("attendanceDAO")
public class AttendanceDAOImpl implements AttendanceDAO {

	private SqlSession sqlSession;
	
	@Override
	//출석현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception{
		return sqlSession.selectList(null, memberVO);
	}
	
	@Override
	//출석생성
	public void attendMake(AttendanceVO attendanceVO) throws Exception {
		sqlSession.insert(null, attendanceVO);

	}

	@Override
	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exception {
		sqlSession.update(null, memberVO);
	}
		
	@Override
	//출석체크 버튼을 누른경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception {
		sqlSession.update(null, attendanceVO);
	}

	@Override
	//출석관리 화면
	public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception {
		
		return sqlSession.selectList(null, attendanceVO);
	}

}
