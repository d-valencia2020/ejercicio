package com.challenge.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.challenge.model.Person;
import com.challenge.challenge.services.CelebrityService;

@RequestMapping("/api/celebrity")
@RestController
public class CelebrityController {

	public final CelebrityService celebrityService;

	@Autowired
	public CelebrityController(CelebrityService celebrityService) {
		this.celebrityService = celebrityService;

	}

	@GetMapping
	public List<Person> findCelebrity() {
		return celebrityService.getCelebrity();
	}

}
