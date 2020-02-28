package com.challenge.challenge.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.challenge.challenge.model.KnownPerson;

@Qualifier("dataBaseReader")
@Service
public class DataBaseReader implements Reader {

	/*
	 * It does not implement the database structure. It is missing.
	 */
	public List<KnownPerson> getKnows() {

		return Collections.EMPTY_LIST;
	}
}
