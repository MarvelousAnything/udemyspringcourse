package com.thearchermancoding.udemyspringcourse.coach;

import com.thearchermancoding.udemyspringcourse.fortune.FortuneService;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Ya better hide: " + fortuneService.getFortune();
	}

}










