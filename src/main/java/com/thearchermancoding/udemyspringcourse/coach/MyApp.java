package com.thearchermancoding.udemyspringcourse.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCricketCoach.toString());
		context.close();
	}

}
