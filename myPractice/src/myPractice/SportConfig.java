package myPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService goodFortuneService() {
		return new GoodFortuneService();
	}
	
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(goodFortuneService());
	}

}
