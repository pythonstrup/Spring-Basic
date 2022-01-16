package com.bigbell.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
