package com.bbt.toclass.member.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbt.toclass.member.controller.MemberControllerImpl;
import com.bbt.toclass.member.dao.MemberDAO;
import com.bbt.toclass.member.vo.AuthVO;
import com.bbt.toclass.member.vo.MemberVO;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public MemberVO login(MemberVO member) throws Exception{
		logger.info("DAO에 로그인 요청");
		return memberDAO.loginByEmail(member);
	}
	
	@Override
	public void sendAuthCode(String authCode, String email) {
		Properties prop = System.getProperties();
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "587");
		
		Authenticator auth = new AuthVO();
		Session session = Session.getDefaultInstance(prop, auth);
		MimeMessage msg = new MimeMessage(session);
		
		try {
			msg.setSentDate(new Date());
			msg.setFrom(new InternetAddress("toclass.authentication@gmail.com", "투클래스"));
			InternetAddress to = new InternetAddress(email);         
			
			msg.setRecipient(Message.RecipientType.TO, to);            
			msg.setSubject("[투클래스] 본인인증 번호", "UTF-8");            
			msg.setText("본인인증 번호는 " + authCode + "입니다.", "UTF-8");            
			Transport.send(msg);
			logger.info("이메일 전송 성공");
		} 
		
		catch(AddressException ae) {            
			logger.info("AddressException : " + ae.getMessage());
		} 
		
		catch(MessagingException me) {            
			logger.info("MessagingException : " + me.getMessage());
		} 
		
		catch(UnsupportedEncodingException e) {
			logger.info("UnsupportedEncodingException : " + e.getMessage());
		}
        
	}
	
	@Override
	public String checkEmailDuplicate(MemberVO member) throws Exception{
		logger.info("DAO에 이메일 중복 확인 요청");
		int result = memberDAO.checkEmailDuplicate(member);
		String isDuplicate = "";
		
		if (result > 0) {
			isDuplicate = "true";
		}
		
		else {
			isDuplicate = "false";
		}
		
		logger.info("DAO로부터 성공적으로 응답 수신");
		logger.info("전송된 값. isDuplicate : " + isDuplicate);
		
		return isDuplicate;
	}
	
	@Override
	public boolean register(MemberVO member) throws Exception {
		logger.info("DAO에 회원정보 등록 요청");
		int result = memberDAO.register(member);
		boolean isRegister = false;
		
		if (result == 1) {
			isRegister = true;
		}
		
		else {
			isRegister = false;
		}
		
		logger.info("DAO로부터 성공적으로 응답 수신");
		logger.info("전송된 값. isRegister : " + isRegister);
		
		return isRegister;
	}
	
}
