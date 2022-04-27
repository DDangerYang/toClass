package com.bbt.toclass.attendance.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.bbt.toclass.attendance.vo.AttendanceVO;
import com.bbt.toclass.member.vo.MemberVO;

@Repository("attendanceDAO")
public class AttendanceDAOImpl implements AttendanceDAO {
	private static final Logger logger = LoggerFactory.getLogger(AttendanceDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	//출석 현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws DataAccessException {
		List<AttendanceVO> list = sqlSession.selectList("mapper.attendance.attendList", memberVO);
		return list;
	}
	
//	@Override
//	//출석 저장
//	public void attendInsert(AttendanceVO attendanceVO) throws DataAccessException{
//		
//	}

}





//@Override
////출석현황 리스트 출력
//public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception{
//	return sqlSession.selectList("attendMapper.attendList", memberVO);
//}
//
//@Override
////출석상태 update
//public void attendUpdate(MemberVO memberVO) throws Exception {
//	sqlSession.update("attendMapper.attendUpdate", memberVO);
//}
//	
//@Override
////출석체크 버튼을 누른경우
//public void attendClick(AttendanceVO attendanceVO) throws Exception {
//	sqlSession.update("attendMapper.attendClick", attendanceVO);
//}
//
////@Override
//////페이지 들어갈 때 비밀번호 확인
////public void teacherCheck(MemberVO memberVO) throws Exception {
////	sqlSession.
////}
//
//@Override
////선택한 출석정보 불러오기
//public AttendanceVO attendSelect(AttendanceVO attendanceVO) throws Exception {
//	return sqlSession.selectOne("attendMapper.attendSelect", attendanceVO);
//}
//@Override
////출석관리 화면
//public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception {
//	
//	return sqlSession.selectList("attendMapper.attendManage", attendanceVO);
//}
//
//@Override
////calendar용 출석 리스트
//public List<AttendanceVO> attendListCalendar(AttendanceVO attendanceVO) throws Exception {
//	return sqlSession.selectList("attendMapper.attendListCalendar", attendanceVO);
//}
//
//@Override
////출석체크 일괄처리
//public void attendCheckAll(AttendanceVO attendanceVO) throws Exception {
//	sqlSession.update("attendMapper.attendCheckAll", attendanceVO);
//}
//