package com.toclass.myapp.attendance.dao;

import java.util.List;

import com.toclass.myapp.attendance.vo.AttendanceVO;

public interface AttendanceDAO {

	//출석 현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception;
	
	//출석체크 버튼을 누른 경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception;
	
	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exceprion;
	
	
}
