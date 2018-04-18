package com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.service;

import com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.entity.Student;

public interface EnrollmentNumberServiceI {

	public Student findByEnrollmentNumber(String enroll);

}
