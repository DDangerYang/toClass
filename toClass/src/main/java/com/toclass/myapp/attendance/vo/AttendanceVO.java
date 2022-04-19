package com.toclass.myapp.attendance.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("attendanceVO")
public class AttendanceVO {
	private String id;
	private String attendance_status;
	private Date time;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAttendance_status( ) {
		return attendance_status;
	}
	public void setAttendance_status(String attendance_status) {
		this.attendance_status = attendance_status;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}