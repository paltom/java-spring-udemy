package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SportConfig.class)) {

            // get the bean from spring container
            SwimCoach coach = applicationContext.getBean("swimCoach", SwimCoach.class);

            // call a method on the bean
            System.out.println(coach.getDailyWorkout());
            System.out.println(coach.getDailyFortune());

            System.out.println("email: " + coach.getEmail());
            System.out.println("team: " + coach.getTeam());
        } catch (BeansException e) {
            // TODO: handle exception
        }
    }
}
