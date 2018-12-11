package com.training.spring.sender;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.spring.bean.StudentInfo;
import com.training.spring.producer.InformationProducer;

public class InformationSender {

	@Autowired
	private InformationProducer informationProducer;

	public void writeInformation(StudentInfo info) {
		informationProducer.displayInformation(info);
	}


	public void setInformationProducer(InformationProducer informationProducer) {
		this.informationProducer = informationProducer;
	}


}
