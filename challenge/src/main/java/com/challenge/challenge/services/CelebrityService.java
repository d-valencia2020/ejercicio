package com.challenge.challenge.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.challenge.model.KnownPerson;
import com.challenge.challenge.model.Person;

@Service
public class CelebrityService {

	private Reader reader;

	@Autowired
	public CelebrityService(Reader reader) {
		this.reader = reader;
	}

	public List<Person> getCelebrity() {
		List<KnownPerson> knowns = reader.getKnows();
		List<Person> celebrities = new ArrayList<>();
		List<Person> guests = knowns.stream().map(KnownPerson::getGuest).distinct().collect(Collectors.toList());
		List<Person> candidates = knowns.stream().map(KnownPerson::getCandidate).collect(Collectors.toList());
		candidates.removeAll(guests);
		Map<Person, Long> candidatesMap = candidates.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Map.Entry<Person, Long> entry : candidatesMap.entrySet()) {
			if (guests.size() == entry.getValue()) {
				celebrities.add(entry.getKey());
			}
		}
		return celebrities;
	}
}
