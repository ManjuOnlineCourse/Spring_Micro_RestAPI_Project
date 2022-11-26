package com.myproject.EmailNotification;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.myproject.EmailNotification.Service.EmailSendService;

@SpringBootApplication
public class SpringSecurityJwt1Application {

	@Autowired
	private EmailSendService emailSendService;
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwt1Application.class, args);
		
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void tringgerMail() throws MessagingException {
		
		emailSendService.sendEmailWithAttachment("chandansv21997@gmail.com", "Have a great day!", "Good Morning!","C:\\Users\\91814\\Downloads\\flower.jpg");
		
	}

}
