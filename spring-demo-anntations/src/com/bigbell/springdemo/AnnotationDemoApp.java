package com.bigbell.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
//		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("footballCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
