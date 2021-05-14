package com.kristina.spring.models;

import com.kristina.spring.services.SportsMotivationService;

public class FootballCoach implements Coach{
    private SportsMotivationService motivationService;

    public FootballCoach(){
        System.out.println("Football coach was created.");
    }
    
    @Override
    public void adviceClient() {
        motivationService.createTrainingPlan();
    }

    public void setMotivationService(SportsMotivationService motivationService) {
        this.motivationService = motivationService;
    }
}
