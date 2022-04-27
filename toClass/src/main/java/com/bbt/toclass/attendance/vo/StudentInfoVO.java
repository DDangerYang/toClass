package com.bbt.toclass.attendance.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("studentInfoVO")
public class StudentInfoVO {
	private String student_info_id;
	private String member_email;
	private String school_id;
	private String class_id;
	private Date student_info_regdate;
	private Date student_info_moddate;
	
	//생성자
	public StudentInfoVO() {
		
	}
	
	public StudentInfoVO(String student_info_id, String member_email,String school_id,
			String class_id, Date student_info_regdate, Date student_info_moddate) {
		this.student_info_id = student_info_id;
		this.member_email = member_email;
		this.school_id = school_id;
		this.class_id = class_id;
		this.student_info_regdate = student_info_regdate;
		this.student_info_moddate = student_info_moddate; 
	}
	
	public String getStudent_info_id() {
		return student_info_id;
	}
	public void setStudent_info_id(String student_info_id) {
		this.student_info_id = student_info_id;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	public Date getStudent_info_regdate() {
		return student_info_regdate;
	}
	public void setStudent_info_regdate(Date student_info_regdate) {
		this.student_info_regdate = student_info_regdate;
	}
	public Date getStudent_info_moddate() {
		return student_info_moddate;
	}
	public void setStudent_info_moddate(Date student_info_moddate) {
		this.student_info_moddate = student_info_moddate;
	}
	
	
	
}
