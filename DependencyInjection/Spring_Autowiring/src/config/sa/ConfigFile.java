package config.sa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.sa.Address;
import beans.sa.Student;

@Configuration
public class ConfigFile {
	@Bean
	public Address addr() {
		Address obj= new Address() ;
			obj.setCity("K");
			obj.setState("AP");
			return obj;

			}
	@Bean
	public Student stu() {
		Student obj = new Student();
		obj.setId(3);
		obj.setName("Johnson");
		return obj;
	}
	}

	
