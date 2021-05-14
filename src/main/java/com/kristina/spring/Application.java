package com.kristina.spring;

import com.kristina.spring.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		//Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Retrieve bean from Spring container
		Coach myCoach = context.getBean("coach", Coach.class);
		//
		myCoach.train();
		// Close the context
		context.close();
	}
}
