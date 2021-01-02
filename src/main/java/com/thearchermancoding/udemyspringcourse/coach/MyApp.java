package com.thearchermancoding.udemyspringcourse.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
