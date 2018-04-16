package com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.service;

import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.entity.Person;

public interface PersonServiceI {

	public void inserPersonRecord(Person person);

	public Person getPersonById(Long personid);

}
