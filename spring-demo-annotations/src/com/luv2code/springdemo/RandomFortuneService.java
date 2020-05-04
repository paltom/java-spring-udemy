package com.luv2code.springdemo;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    private List<String> data = List.of("Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck", "The journey is the reward");

    private Random random = new Random();

    @Override
    public String getFortune() {
        return data.get(random.nextInt(data.size()));
    }

}
