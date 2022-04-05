package com.cognizant.injectingObjectPgm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPgm {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("StudentxmlData.xml");
        StudentName studentName=(StudentName) context.getBean("sinfo");
        studentName.printData();
    }
}
