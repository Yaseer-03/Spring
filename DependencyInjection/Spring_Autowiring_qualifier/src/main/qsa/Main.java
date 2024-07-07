package main.qsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import beans.qsa.Student;
import resources.qsa.ConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		Student firstObject = (Student) context.getBean(Student.class);
		firstObject.studentDetails();
	}
}
