package resources.sp.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.sp.javaconfig.Student;


@Configuration
public class Config {
	@Bean("firstObject")
	public Student meth1() {
		Student firstStudent = new Student();
		firstStudent.setId(1);
		firstStudent.setName("John");
		firstStudent.setGender("Male");
		return firstStudent;
	}

}
