package com.training.spring.config;

import java.math.BigInteger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.bean.StudentInfo;
import com.training.spring.producer.HTMLInformationProducer;
import com.training.spring.producer.InformationProducer;
import com.training.spring.sender.InformationSender;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public InformationProducer informationProducer() {
		return new HTMLInformationProducer();
	}
	  
	@Bean
	public InformationSender informationSender() {
		return new InformationSender();
	}
	
	@Bean
	public StudentInfo studentInfo() {
		StudentInfo sInfo = new StudentInfo();
		sInfo.setName("Rohan Kumar");
		sInfo.setBranch("CSE");
		sInfo.setEmailId("Rohan@gmail.com");
		sInfo.setRollNo(123);
		sInfo.setMobileNo(new BigInteger("1234567"));
		return sInfo;
	}

}
