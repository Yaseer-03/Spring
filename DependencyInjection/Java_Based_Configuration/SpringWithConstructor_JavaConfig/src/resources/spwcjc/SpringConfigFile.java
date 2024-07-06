package resources.spwcjc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.spwcjc.Man;
import beans.spwcjc.Personality;

@Configuration
public class SpringConfigFile {
	@Bean
	public Personality personOne() {
		Personality person1 = new Personality(6,95);
		return person1;
	}
	@Bean
	public Man manOne() {
		Man man1 = new Man("Rock", 783649, personOne());
		return man1;
	}

}
