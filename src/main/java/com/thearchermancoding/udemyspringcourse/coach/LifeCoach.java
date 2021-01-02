package com.thearchermancoding.udemyspringcourse.coach;

import com.thearchermancoding.udemyspringcourse.fortune.FortuneService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LifeCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Die in a hole!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
