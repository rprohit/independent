/*package com.sns.independent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sns.independent.domain.Person;
import com.sns.independent.repo.PersonRepository;
import com.sns.independent.rest.views.PersonList;


@RestController
@RequestMapping("/")
public class PersonRestController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/persons")
	public PersonList allPersons() {
		List<Person> allPersons = personRepository.findAll();
		return new PersonList(allPersons);
	}
	
	@RequestMapping(value="/persons", method=RequestMethod.POST)
	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
		personRepository.save(person);
		return new ResponseEntity<Person>(person,HttpStatus.CREATED);
	}
}
*/