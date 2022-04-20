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
		return sqlSession.selectList("attendMapper.attendList", memberVO);
	}
	
	@Override
	//출석생성
	public void attendMake(AttendanceVO attendanceVO) throws Exception {
		sqlSession.insert("attendMapper.attendMake", attendanceVO);

	}
	@Override
	//추가한 출석 불러오기
	public AttendanceVO attendLast(MemberVO memberVO) throws Exception{
		return sqlSession.selectOne("attendMapper.attendLast", memberVO);
	}
	@Override
	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exception {
		sqlSession.update("attendMapper.attendUpdate", memberVO);
	}
		
	@Override
	//출석체크 버튼을 누른경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception {
		sqlSession.update("attendMapper.attendClick", attendanceVO);
	}
	@Override
	//선택한 출석정보 불러오기
	public AttendanceVO attendSelect(AttendanceVO attendanceVO) throws Exception {
		return sqlSession.selectOne("attendMapper.attendSelect", attendanceVO);
	}
	@Override
	//출석관리 화면
	public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception {
		
		return sqlSession.selectList(null, attendanceVO);
	}

}
