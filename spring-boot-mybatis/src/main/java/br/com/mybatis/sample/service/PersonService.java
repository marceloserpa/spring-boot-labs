package br.com.mybatis.sample.service;

import java.util.List;

import br.com.mybatis.sample.model.Person;
import br.com.mybatis.sample.persistence.PersonMapper;

public class PersonService {

	private PersonMapper personMapper;
	
	public PersonService(PersonMapper personMapper){
		this.personMapper = personMapper;
	}
	
	public Long save(Person person){
		return this.personMapper.save(person);
	}
	
	public List<Person> list(){
		return this.personMapper.getAll();
	}
	
}
