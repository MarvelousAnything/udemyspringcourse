package com.thearchermancoding.udemyspringcourse.coach;

import com.thearchermancoding.udemyspringcourse.fortune.FortuneService;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String team;

    private String email;

    @Override
    public String getDailyWorkout() {
        return "Bludgeon 5 high school students' brains on prom night.";
    }

    @Override
    public String getDailyFortune() {
        return "\"O\": " + fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "CricketCoach {" +
                "\n\tdailyfortune: '" + getDailyFortune() + '\'' +
                "\n\tteam: '" + team + '\'' +
                "\n\temail: '" + email + '\'' +
                "\n}";
    }
}
