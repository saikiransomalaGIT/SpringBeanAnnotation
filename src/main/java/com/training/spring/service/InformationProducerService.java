package com.training.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.bean.StudentInfo;
import com.training.spring.config.ApplicationConfiguration;
import com.training.spring.sender.InformationSender;

public class InformationProducerService {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		InformationSender informationSender = applicationContext.getBean("informationSender", InformationSender.class);
		
		StudentInfo studentInfo = applicationContext.getBean("studentInfo", StudentInfo.class);
		
		informationSender.writeInformation(studentInfo);

		
	}

}
