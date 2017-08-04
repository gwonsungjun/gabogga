package com.gbg.member.service;

import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbg.list.dao.ListDao;
import com.gbg.list.model.ListDto;
import com.gbg.member.dao.AdminDao;
import com.gbg.member.mail.SMTPAuthenticatior;
import com.gbg.member.model.QnaDto;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void sendQnaMail(QnaDto qnaDto) {

		String to = "didhomin@gmail.com";
		String from = "didhomin@gmail.com";
		String subject = qnaDto.getName()+"("+qnaDto.getFrom() +"님이 보낸 문의 메일입니다.";
		String content = "제목 : "+qnaDto.getSubject()+"<br><br>"+"내용 : "+qnaDto.getContent();
		Properties p = new Properties();

		p.put("mail.smtp.host", "smtp.gmail.com"); 
		p.put("mail.smtp.port", "25");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.debug", "true");
		p.put("mail.smtp.socketFactory.port", "465");
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");
		p.setProperty("mail.stmp.port", "465");
		p.setProperty("mail.smtp.socketFactory.port", "465");
		

		try {
			Authenticator auth = new SMTPAuthenticatior();
			Session ses = Session.getInstance(p, auth);


			MimeMessage msg = new MimeMessage(ses);
			msg.setSubject(subject); 

			Address fromAddr = new InternetAddress(from);
			msg.setFrom(fromAddr);

			Address toAddr = new InternetAddress(to);
			msg.addRecipient(Message.RecipientType.TO, toAddr); 

			msg.setContent(content, "text/html;charset=UTF-8"); // 내용과 인코딩

			Transport.send(msg); 
		} catch (Exception e) {
			
			return;
		}
	}

	@Override
	public List<ListDto> address(String address) {
		return sqlSession.getMapper(AdminDao.class).address(address);
	}

	@Override
	public List<ListDto> main() {
		return sqlSession.getMapper(AdminDao.class).main();
	}

	@Override
	public List<ListDto> mainprice() {
		return sqlSession.getMapper(AdminDao.class).mainprice();
	}

	@Override
	public int man() {
		return sqlSession.getMapper(AdminDao.class).man();
	}

	@Override
	public int woman() {
		return sqlSession.getMapper(AdminDao.class).woman();
	}


}
