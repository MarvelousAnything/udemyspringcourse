package com.thearchermancoding.udemyspringcourse.coach;

public class LifeCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Die in a hole!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
