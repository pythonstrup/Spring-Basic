package myPractice;

import org.springframework.beans.factory.annotation.Value;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.team}")
	private String team;
	
	@Value("${foo.location}")
	private String location;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}

	public String getLocation() {
		return location;
	}
	
	

}
