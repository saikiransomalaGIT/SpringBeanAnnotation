package com.training.spring.producer;

import java.io.FileWriter;
import java.io.IOException;

import com.training.spring.bean.StudentInfo;

public class HTMLInformationProducer implements InformationProducer {
	
	private String htmlheader = "<html><head><title>Student Information</title></head><body>" ;
    private String htmlfooter="</body></html>";

	public void displayInformation(StudentInfo sInfo) {
		try {
            FileWriter writer = new FileWriter("studentInfo.html", true);
            writer.write(htmlheader);
            writer.write("Student Name : " + sInfo.getName() + "<br />");
            writer.write("Branch Name  : " + sInfo.getBranch() + "<br />");
            writer.write("Roll No : " + sInfo.getRollNo() + "<br />");
            writer.write("Email ID : " + sInfo.getEmailId() + "<br />");
            writer.write("Mobile No : " + sInfo.getMobileNo() + "<br />");
            writer.write(htmlfooter);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
