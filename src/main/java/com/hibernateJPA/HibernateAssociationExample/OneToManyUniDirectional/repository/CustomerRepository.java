package com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	/* public Optional<Customer> findById(Long id); */

	public Customer findByid(Long id);

}
