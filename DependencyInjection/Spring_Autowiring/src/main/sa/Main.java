package main.sa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.sa.Student;
import config.sa.ConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		Student student_1 = (Student) context.getBean("stu");
		student_1.studentDetails();
	}
}
