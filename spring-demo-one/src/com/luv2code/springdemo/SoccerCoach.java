package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice ball passing";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
