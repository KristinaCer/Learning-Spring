package com.kristina.spring.models;

import com.kristina.spring.services.SportsMotivationService;

public class FootballCoach implements Coach{
    private SportsMotivationService motivationService;



    private String emailAddress;
    private String teamName;

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

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
