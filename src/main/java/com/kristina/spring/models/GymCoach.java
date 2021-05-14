package com.kristina.spring.models;

import com.kristina.spring.services.GymCoachService;

public class GymCoach implements Coach{
    private GymCoachService coachService;

    //Spring container will automatically create gym coach object after it was mapped in the application context file.
    public GymCoach(GymCoachService gymCoachService){
        this.coachService = gymCoachService;
        System.out.println("Gym coach created.");
    }

    public void train(){
        System.out.println("Gym coach started training.");
    }

    @Override
    public void adviceClient() {
        this.coachService.createTrainingPlan();
    }
}
