package main.sp.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.sp.javaconfig.Student;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext("/resources/sp/javaconfig");
		Student std = (Student) context.getBean("firstObject");
		std.studentDetails();
		
		
	}
}
