package com.thearchermancoding.udemyspringcourse.fortune;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "The world is ending in two seconds...";
    }
}
