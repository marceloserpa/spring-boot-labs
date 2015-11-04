package br.com.mybatis.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mybatis.sample.model.Person;
import br.com.mybatis.sample.service.PersonService;

@RestController
public class PersonController {

	@Autowired PersonService personService;
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	public List<Person> get(){
		return personService.list();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public Long addNewPerson(Person person){
		personService.save(person);
		return person.getId();
	}
	
}
