package br.com.mybatis.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.mybatis.sample.persistence.PersonMapper;
import br.com.mybatis.sample.service.PersonService;

@Component
public class ServiceConfig {

	@Bean
	public PersonService personService(PersonMapper personMapper){
		return new PersonService(personMapper);
	}
	
}
