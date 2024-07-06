package main.spdiwc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.spdiwc.Employee;

public class Main{
	public static void main(String[] args) {
		String config_path = "/resources/spdiwc/ApplicationConfigFile.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
		Employee employee = (Employee) context.getBean("firstObject");
		employee.detailsOfEmployee();	}

}
