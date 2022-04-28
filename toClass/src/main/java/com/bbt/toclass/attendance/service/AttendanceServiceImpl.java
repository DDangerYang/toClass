package com.bbt.toclass.attendance.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbt.toclass.attendance.dao.AttendanceDAO;
import com.bbt.toclass.attendance.vo.AttendanceVO;
import com.bbt.toclass.member.vo.MemberVO;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {

	private static final Logger logger = LoggerFactory.getLogger(AttendanceService.class);
	@Autowired
	private AttendanceDAO dao;
	
	//출석 현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception {
		return dao.attendList(memberVO);
	}
	
	

	@Override
	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exception {
	dao.attendUpdate(memberVO);
	}

	@Override
	//출석체크 버튼을 누른경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception {
	dao.attendClick(attendanceVO);
	}

	// @Override
	// //페이지 들어갈 때 비밀번호 확인
	// public void teacherCheck(MemberVO memberVO) throws Exception {
	//
	// }

	@Override
	//출석체크 일괄처리
	public void attendCheckAll(AttendanceVO attendanceVO) throws Exception {
	dao.attendCheckAll(attendanceVO);
	}

}






//@Override
////출석 현황 리스트 출력
//public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception {
//	return dao.attendList(memberVO);
//}
//
//@Override
////출석관리 화면
//public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception {
//	return dao.attendManage(attendanceVO);
//}
//
//@Override
////출석상태 update
//public void attendUpdate(MemberVO memberVO) throws Exception {
//	dao.attendUpdate(memberVO);
//}
//
//@Override
////출석체크 버튼을 누른경우
//public void attendClick(AttendanceVO attendanceVO) throws Exception {
//	dao.attendClick(attendanceVO);
//}
//
////@Override
//////페이지 들어갈 때 비밀번호 확인
////public void teacherCheck(MemberVO memberVO) throws Exception {
////	
////}
//
//@Override
////선택한 출석정보 불러오기
//public AttendanceVO attendSelect(AttendanceVO attendanceVO) throws Exception {
//	return dao.attendSelect(attendanceVO);
//}
//
//@Override
////calendar용 출석 리스트
//public List<AttendanceVO> attendListCalendar(AttendanceVO attendanceVO) throws Exception {
//	return dao.attendListCalendar(attendanceVO);
//}
//
//@Override
////출석체크 일괄처리
//public void attendCheckAll(AttendanceVO attendanceVO) throws Exception {
//	dao.attendCheckAll(attendanceVO);
//}