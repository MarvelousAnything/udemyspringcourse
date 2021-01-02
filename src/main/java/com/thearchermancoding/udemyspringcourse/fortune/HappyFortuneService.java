package com.thearchermancoding.udemyspringcourse.fortune;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] fortunes = {"A", "B", "C"};

    @Override
    public String getFortune() {
        int index = new Random().nextInt(fortunes.length);
        return fortunes[index];
    }
}
