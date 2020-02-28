package com.challenge.challenge.services;

import java.util.List;

import com.challenge.challenge.model.KnownPerson;

public interface Reader {

	/**
	 * Get the people knows
	 * 
	 * @return
	 */
	List<KnownPerson> getKnows();

}
