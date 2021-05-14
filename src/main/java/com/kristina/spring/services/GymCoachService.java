package com.kristina.spring.services;

public class GymCoachService implements GymService{

    public  GymCoachService(){
        System.out.println("GymCoach service created.");
    }
    @Override
    public void createTrainingPlan() {
        System.out.println("Gym couch created a training plan for you.");
    }
}
