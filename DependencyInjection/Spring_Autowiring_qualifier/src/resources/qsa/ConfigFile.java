package resources.qsa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.qsa.Address;
import beans.qsa.Student;
import beans.qsa.Subject;

@Configuration
public class ConfigFile {
	@Bean
	public Address address_1() {
		Address obj = new Address();
		obj.setCity("Bangalore");
		obj.setState("Karnataka");
		return obj;
	}
	
	@Bean 
	public Address address_2() {
		Address obj = new Address();
		obj.setCity("Hyderabad");
		obj.setState("Telangana");
		return obj;
	}
	@Bean
	public Subject subjects_1() {
		Subject obj = new Subject();
		List<String> subjs = new ArrayList<>();
		subjs.add("Java");
		subjs.add("Python");
		subjs.add("GO");
		obj.setSubjects(subjs);
		return obj;
	}
	
	@Bean
	public Student student_1() {
		Student obj = new Student();
		obj.setId(5);
		obj.setName("Riya");
		return obj;
	}

}
