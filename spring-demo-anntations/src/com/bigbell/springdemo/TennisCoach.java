package com.bigbell.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// Constructor Injection
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor (Field Injection)");
	}

	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}


	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> TennisCoach: inside start stuff");
	}
	
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside clean up stuff");
	}

}
