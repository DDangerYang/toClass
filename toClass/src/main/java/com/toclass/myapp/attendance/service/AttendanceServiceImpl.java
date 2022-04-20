package com.toclass.myapp.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toclass.myapp.attendance.dao.AttendanceDAO;
import com.toclass.myapp.attendance.vo.AttendanceVO;
import com.toclass.myapp.member.vo.MemberVO;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private AttendanceDAO dao;
	
	@Override
	//출석현황 리스트 출력
	public List<AttendanceVO> attendList(MemberVO memberVO) throws Exception {
		return dao.attendList(memberVO);
	}

	@Override
	//출석생성
	public void attendMake(AttendanceVO attendanceVO) throws Exception {
		dao.attendMake(attendanceVO);
	}

	@Override
	//추가한 출석 불러오기
	public AttendanceVO attendLast(MemberVO memberVO) throws Exception {
		return dao.attendLast(memberVO) ;
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

	@Override
	//선택한 출석정보 불러오기
	public AttendanceVO attendSelect(AttendanceVO attendanceVO) throws Exception {
		return dao.attendSelect(attendanceVO);
	}

	@Override
	//출석관리 화면
	public List<AttendanceVO> attendManage(AttendanceVO attendanceVO) throws Exception {
		return dao.attendManage(attendanceVO);
	}

}
