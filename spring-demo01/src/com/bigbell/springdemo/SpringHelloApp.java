package com.bigbell.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach2", Coach.class);
		
		// call method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		
		// let's call our new method for fortune
		System.out.println(coach.getDailyFortune());
		System.out.println(coach2.getDailyFortune());
		
		// close the context
		context.close();

	}

}
