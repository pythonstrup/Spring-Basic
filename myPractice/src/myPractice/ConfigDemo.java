package myPractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SoccerCoach coach = context.getBean("soccerCoach", SoccerCoach.class);
		
		System.out.println(coach.getFortune());
		System.out.println(coach.getTeam());
		System.out.println(coach.getLocation());
		
		context.close();
	}

}
