package com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.entity.Person;
import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.repo.PersonRepository;
import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.service.PersonServiceI;

@Service
public class PersonServiceImpl implements PersonServiceI {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void inserPersonRecord(Person person) {
		personRepository.save(person);
	}

	@Override
	public Person getPersonById(Long personid) {
		return personRepository.findByid(personid);
	}

}
