package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Tennis Coach: inside init method");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach: inside destroy method");
    }
    
    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    /**
     * @param fortuneService the fortuneService to set
     */
    /* @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("setting fortune service in TennisCoach");
        this.fortuneService = fortuneService;
    } */
}
