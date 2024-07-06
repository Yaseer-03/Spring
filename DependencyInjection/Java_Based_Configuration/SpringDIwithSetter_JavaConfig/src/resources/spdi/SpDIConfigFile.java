package resources.spdi;
import beans.spdi.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpDIConfigFile {
	@Bean
	public Personality personalityDetails() {
		Personality person = new Personality();
		person.setHeight(6);
		person.setWeight(95);
		return person;
	}
	
	@Bean("object1")
	public Man meth1() {
		Man man1 =new Man();
		man1.setName("Dwayne");
		man1.setMobileNumber(123456);
		man1.setDetails(personalityDetails());
		return man1;
	}

}
