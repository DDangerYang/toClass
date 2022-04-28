package com.bbt.toclass.attendance.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.bbt.toclass.attendance.vo.AttendanceVO;
import com.bbt.toclass.member.vo.MemberVO;

public interface AttendanceDAO {

	//출석 현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws DataAccessException;

	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exception;
	
	//출석체크 버튼을 누른 경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception;
	
//	//페이지 들어갈 때 비밀번호 확인
//	public void teacherCheck(MemberVO memberVO) throws Exception;
	
	//출석체크 일괄처리
	public void attendCheckAll(AttendanceVO attendanceVO) throws Exception;
	
	
}




//	//calendar용 출석 리스트
//	public List<AttendanceVO> attendListCalendar(AttendanceVO attendanceVO) throws Exception;
