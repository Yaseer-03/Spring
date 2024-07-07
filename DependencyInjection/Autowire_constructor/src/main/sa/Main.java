package main.sa;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.sa.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/config/sa/ConfigFig.xml");
		Student student_1 = (Student) context.getBean("firstObject");
		student_1.studentDetails();
	}
}
