package com.toclass.myapp.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toclass.myapp.member.dao.MemberDAO;
import com.toclass.myapp.member.vo.AuthVO;
import com.toclass.myapp.member.vo.MemberVO;

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
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public MemberVO login(MemberVO memberVO) throws Exception{
		return memberDAO.loginById(memberVO);
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
			
		} 
		
		catch(AddressException ae) {            
			System.out.println("AddressException : " + ae.getMessage());           
		} 
		
		catch(MessagingException me) {            
			System.out.println("MessagingException : " + me.getMessage());
		} 
		
		catch(UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException : " + e.getMessage());
		}
            
	}
	
}
