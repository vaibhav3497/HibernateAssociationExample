package com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.entity.Student;
import com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.repository.EnrollRepository;
import com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.service.EnrollmentNumberServiceI;

@Service
public class EnrollmentNumberServiceImpl implements EnrollmentNumberServiceI {

	@Autowired
	private EnrollRepository enrollRepo;

	@Override
	public Student findByEnrollmentNumber(String enroll) {
		return enrollRepo.findByenroll(enroll).getStudent();
	}

}
