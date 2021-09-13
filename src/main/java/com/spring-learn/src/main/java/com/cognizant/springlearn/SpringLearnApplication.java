package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
        try {
            displayDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        displayCountry();
    }

    public static void displayDate() throws ParseException {
        LOGGER.info("Start");
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        Date date = format.parse("31/12/2018");
        LOGGER.debug(date.toString());
        LOGGER.info("End");
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        Country anotherCountry = context.getBean("country", Country.class);

        //By default, only one instance of the country is created:
        LOGGER.debug("Country : {}", country.hashCode());
        LOGGER.debug("Another country : {}", anotherCountry.hashCode());

        //Retrieving a list from the spring-config file.
        List<Country> countryList = context.getBean("countryList", ArrayList.class);
        countryList.stream().forEach(System.out::println);
    }
}
