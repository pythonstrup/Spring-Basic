package com.bigbell.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		Coach coach2 = context.getBean("baseballCoach", Coach.class);
		Coach betaCoach = context.getBean("baseballCoach", Coach.class);
		
		// check if they are the same
		boolean result = (coach == alphaCoach);
		boolean result2 = (coach2 == betaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object " + result);
		System.out.println("\nMemory location for the coach: " + coach);
		System.out.println("\nMemory location for the alphaCoach: " + alphaCoach);
		System.out.println("\n\n");
		
		System.out.println("\nPointing to the same object " + result2);
		System.out.println("\nMemory location for the coach: " + coach2);
		System.out.println("\nMemory location for the alphaCoach: " + betaCoach);
		
		context.close();
	}

}
