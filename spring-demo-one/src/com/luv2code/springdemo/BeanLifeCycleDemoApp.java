package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beanLifeCycle-applicationContext.xml")) {
            // retrieve bean from spring container
            Coach theCoach = applicationContext.getBean("myCoach", Coach.class);

            System.out.println(theCoach.getDailyWorkout());
        } catch (BeansException e) {
        }

    }

}
