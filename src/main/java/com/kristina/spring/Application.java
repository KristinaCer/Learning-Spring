package com.kristina.spring;

import com.kristina.spring.models.Coach;
import com.kristina.spring.models.GymCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		//Load Spring configuration file
		//Retrieve bean from Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		GymCoach myGymCoach = (GymCoach) context.getBean("gymCoach", Coach.class);
		//Call methods on the object
		myGymCoach.adviceClient();
		//Prove that default bean configuration is SINGLETON:
		GymCoach myOtherGymCoach = (GymCoach) context.getBean("gymCoach", Coach.class);
		System.out.println("Memory location for myGymCoach: "  + myGymCoach);
		System.out.println("Memory location for myOtherGymCoach: "  + myOtherGymCoach);
		// Close the context
		context.close();
	}
}
