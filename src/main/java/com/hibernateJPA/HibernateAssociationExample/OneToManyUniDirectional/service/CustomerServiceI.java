package com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.service;

import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.entity.Customer;

public interface CustomerServiceI {

	public Customer findCustomerById(Long id);

	public void addCustomer(Customer customer);

}
