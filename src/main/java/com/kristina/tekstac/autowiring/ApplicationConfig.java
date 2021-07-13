package com.kristina.tekstac.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {
    @Bean
    public Passport passport() {
        return new Passport();
    }
    @Bean
    public Employee employee(){
        return new Employee();
    }
}
