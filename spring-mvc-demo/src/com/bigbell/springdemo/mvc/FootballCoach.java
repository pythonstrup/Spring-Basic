package com.bigbell.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	public FootballCoach() {
		System.out.println(">> FootballCoach: inside constructor (setter injection)");
	}

	@Override
	public String getDailyWorkout() {
		
		return "100 times shots";
	}
	
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	// setter method
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> FootballCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
}
