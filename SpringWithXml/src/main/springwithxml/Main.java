package main.springwithxml;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.springwithxml.Employee;
public class Main {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/springwithxml/configuration.xml");
		Employee obj = (Employee) context.getBean("firstObject");
		obj.employeeDetails();
//		System.out.print(obj.getSalary());
	}

}
