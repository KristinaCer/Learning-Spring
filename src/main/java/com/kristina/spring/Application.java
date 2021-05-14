package com.kristina.spring;

import com.kristina.spring.models.Coach;
import com.kristina.spring.models.GymCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		//Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Retrieve bean from Spring container
		GymCoach myGymCoach = (GymCoach) context.getBean("coach", Coach.class);
		//Call methods on the object
		myGymCoach.train();
		myGymCoach.adviceClient();
		// Close the context
		context.close();
	}
}
