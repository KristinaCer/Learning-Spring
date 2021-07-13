package com.kristina.spring_core_basic_examples.models;

import com.kristina.spring_core_basic_examples.services.SportsMotivationService;

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
