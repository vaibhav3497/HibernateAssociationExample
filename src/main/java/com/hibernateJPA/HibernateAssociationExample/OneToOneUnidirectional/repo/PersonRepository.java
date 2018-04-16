package com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	public Person findByid(Long personid);
}
