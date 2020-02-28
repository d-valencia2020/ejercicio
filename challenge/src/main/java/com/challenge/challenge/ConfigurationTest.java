package com.challenge.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.challenge.challenge.services.DataBaseReader;
import com.challenge.challenge.services.FileReader;
import com.challenge.challenge.services.Reader;

@Configuration
@PropertySource("classpath:ejemplo.properties")
public class ConfigurationTest {

	@Autowired
	Environment env;

	@Bean
	@Primary
	@Qualifier("fileReader")
	public Reader createReader() {
		return new FileReader();
	}

	@Bean
	@Qualifier("dataBaseReader")
	public Reader createDataSorceReader() {
		return new DataBaseReader();
	}

}
