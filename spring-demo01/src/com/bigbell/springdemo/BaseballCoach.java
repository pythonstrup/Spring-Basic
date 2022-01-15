package com.bigbell.springdemo;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneservice) {
		this.fortuneService = fortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}
}
