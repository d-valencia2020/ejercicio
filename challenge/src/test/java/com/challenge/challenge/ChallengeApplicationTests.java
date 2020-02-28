package com.challenge.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.challenge.challenge.controller.CelebrityController;
import com.challenge.challenge.model.Person;
import com.challenge.challenge.services.CelebrityService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ChallengeApplicationTests {

	@Autowired
	private CelebrityController celebrityController;

	@Autowired
	private CelebrityService celebrityService;

	@Test
	void contextLoads() {
		assertThat(celebrityController).isNull();
	}

	@Test
	void findCelebrity() {
		List<Person> celebrities = celebrityService.getCelebrity();
		assertThat(celebrities.isEmpty());
	}

}
