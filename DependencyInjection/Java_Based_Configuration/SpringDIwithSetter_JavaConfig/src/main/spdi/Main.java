package main.spdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.spdi.Man;
import resources.spdi.SpDIConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpDIConfigFile.class);
		Man obj1 = (Man) context.getBean("object1");
		obj1.manDetails();
	}
}
