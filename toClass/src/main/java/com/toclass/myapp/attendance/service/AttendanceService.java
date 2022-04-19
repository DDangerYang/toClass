package com.toclass.myapp.attendance.service;

import java.util.List;

import com.toclass.myapp.attendance.vo.AttendanceVO;
import com.toclass.myapp.member.vo.MemberVO;

public interface AttendanceService {

	//출석 현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception;
	
	//출석생성
	public void attendMake(AttendanceVO attendanceVO) throws Exception;
	
	//제일 최근 출석 불러오기
	public AttendanceVO attendLast(MemberVO memberVO) throws Exception;
	
	//출석상태 update
	public void attendUpdate(MemberVO memberVO) throws Exception;
	
	//출석체크 버튼을 누른경우
	public void attendClick(AttendanceVO attendanceVO) throws Exception;
	
	//선택한 출석정보 불러오기
	public AttendanceVO attendSelect(AttendanceVO attendanceVO) throws Exception;
	
	//출석관리 화면
	public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception;
	
}
