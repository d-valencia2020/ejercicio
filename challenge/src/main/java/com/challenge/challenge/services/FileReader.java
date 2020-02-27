package com.challenge.challenge.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.challenge.challenge.model.KnownPerson;
import com.challenge.challenge.model.Person;

@Qualifier("fileReader")
@Service
public class FileReader implements Reader {

	public List<KnownPerson> getKnows() {
		List<KnownPerson> knows = new ArrayList<>();
		try {
			Scanner input = new Scanner(new File("/home/d.valencia/Documents/test/file.txt"));
			while (input.hasNextLine()) {
				String[] person = input.nextLine().split(",");
				Person guess = new Person(Integer.parseInt(person[0]));
				Person candidate = new Person(Integer.parseInt(person[1]));
				knows.add(new KnownPerson(guess, candidate));
			}
			input.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return knows;
	}
}
