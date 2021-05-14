package com.kristina.spring.services;

public class SportsMotivationService implements CoachService {

    public SportsMotivationService(){
        System.out.println("GymCoach service created.");
    }
    @Override
    public void createTrainingPlan() {
        System.out.println("Gym couch created a training plan for you. Let's work out.");
    }
}
