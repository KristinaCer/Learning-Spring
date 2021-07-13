package com.kristina.spring;

import com.kristina.spring.models.GymCoach;
import com.kristina.spring.services.SportsMotivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
