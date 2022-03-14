package com.country_mvc.src.main.java.com.cognizant.springlearn.controller;

import com.country_mvc.src.main.java.com.cognizant.springlearn.service.exception.CountryNotFoundException;
import com.country_mvc.src.main.java.com.cognizant.springlearn.model.Country;
import com.country_mvc.src.main.java.com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class CountryController {

    private CountryService service;
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    public CountryController(CountryService service) {
        LOGGER.info("Inside country controller");
        this.service = service;
    }

    @GetMapping("/country")
    public ResponseEntity<Country> getCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        return new ResponseEntity<>(country, HttpStatus.OK);
    }

    @GetMapping("countries/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) throws CountryNotFoundException {
        Country country = service.getCountry(code);
        return new ResponseEntity<>(country, HttpStatus.OK);
    }

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList", ArrayList.class);
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }


    public Country addCountry(@RequestBody @Valid Country country){
        LOGGER.info("Start addCountry()");

        //Is there a way to write to a country.xml from a method? Without using @Configuration? @Bean?

        return country;
    }
}
