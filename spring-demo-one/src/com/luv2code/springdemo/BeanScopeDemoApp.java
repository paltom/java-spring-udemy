package com.luv2code.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beanScope-applicationContext.xml")) {
            // retrieve bean from spring container
            Coach theCoach = applicationContext.getBean("myCoach", Coach.class);
            Coach alphaCoach = applicationContext.getBean("myCoach", Coach.class);

            // check if they are the same
            System.out.println("Pointing to the same object? " + (theCoach == alphaCoach));
            System.out.println("Memory location for theCoach: " + theCoach);
            System.out.println("Memory location for alphaCoach: " + alphaCoach);
        } catch (BeansException e) {
        }

    }

}
