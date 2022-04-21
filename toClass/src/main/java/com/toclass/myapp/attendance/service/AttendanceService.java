package com.toclass.myapp.attendance.service;

import java.util.List;

import com.toclass.myapp.attendance.vo.AttendanceVO;
import com.toclass.myapp.member.vo.MemberVO;

public interface AttendanceService {

	//출석 현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception;
	
	//출석관리 화면
	public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception;
		
	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exception;
	
	//출석체크 버튼을 누른경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception;
	
//	//페이지 들어갈 때 비밀번호 확인
//	public void teacherCheck(MemberVO memberVO) throws Exception;
	
	//선택한 출석정보 불러오기
	public AttendanceVO attendSelect(AttendanceVO attendanceVO) throws Exception;
	
	//calendar용 출석 리스트
	public List<AttendanceVO> attendListCalendar(AttendanceVO attendVO) throws Exception;
	
	//출석체크 일괄처리
	public void attendCheckAll(AttendanceVO attendanceVO) throws Exception;
}
