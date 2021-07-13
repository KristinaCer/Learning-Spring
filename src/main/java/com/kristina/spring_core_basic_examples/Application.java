package com.kristina.spring_core_basic_examples;

import com.kristina.spring_core_basic_examples.models.Coach;
import com.kristina.spring_core_basic_examples.models.FootballCoach;
import com.kristina.spring_core_basic_examples.models.GymCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		//Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Retrieve bean from Spring container
		GymCoach myGymCoach = (GymCoach) context.getBean("gymCoach", Coach.class);
		FootballCoach footballCoach = (FootballCoach) context.getBean("footballCoach", Coach.class);
		//Call methods on the object
		myGymCoach.adviceClient();
		// Close the context
		context.close();
	}
}
