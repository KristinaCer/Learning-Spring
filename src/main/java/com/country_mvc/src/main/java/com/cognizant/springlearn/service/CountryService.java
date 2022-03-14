package com.country_mvc.src.main.java.com.cognizant.springlearn.service;

import com.country_mvc.src.main.java.com.cognizant.springlearn.service.exception.CountryNotFoundException;
import com.country_mvc.src.main.java.com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList", ArrayList.class);
        for (Country country: countries) {
            if (country.getCode().equals(code)) {
                return country;
            }
            else {
                    throw new CountryNotFoundException();
            }
        }
        return null;
    }
}
