package com.kristina.spring.models;

import com.kristina.spring.services.SportsMotivationService;
import org.springframework.stereotype.Component;


public class GymCoach implements Coach{
    private SportsMotivationService motivationService;

    //Spring container will automatically create gym coach object after it was mapped in the application context file.
    public GymCoach(SportsMotivationService sportsMotivationService){
        this.motivationService = sportsMotivationService;
        System.out.println("Gym coach created.");
    }

    @Override
    public void adviceClient() {
        this.motivationService.createTrainingPlan();
    }
}
