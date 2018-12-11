package com.training.spring.producer;

import java.io.FileWriter;
import java.io.IOException;

import com.training.spring.bean.StudentInfo;

public class TextInformationProducer implements InformationProducer {


	public void displayInformation(StudentInfo sInfo) {
		
		try {
            FileWriter writer = new FileWriter("studentInfo.txt", true);
            writer.write("Student Name : " + sInfo.getName() + "\r\n");
            writer.write("Branch Name  : " + sInfo.getBranch() + "\r\n");
            writer.write("Roll No : " + sInfo.getRollNo() + "\r\n");
            writer.write("Email ID : " + sInfo.getEmailId() + "\r\n");
            writer.write("Mobile No : " + sInfo.getMobileNo() + "\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
