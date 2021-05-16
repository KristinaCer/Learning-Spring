package com.kristina.spring;

import com.kristina.spring.models.FootballCoach;
import com.kristina.spring.models.GymCoach;
import com.kristina.spring.services.SportsMotivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kristina.spring")
public class SportsConfig {
    @Bean
    public SportsMotivationService motivationService() {
        return new SportsMotivationService();
    }
    @Bean
    public GymCoach gymCoach() {
        return new GymCoach(motivationService());
    }

}
