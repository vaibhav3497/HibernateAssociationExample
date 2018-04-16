package com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.entity.Customer;
import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.repository.CustomerRepository;
import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.service.CustomerServiceI;

@Service
public class CustomerSericeImpl implements CustomerServiceI {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer findCustomerById(Long id) {
		return customerRepository.findByid(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

}
