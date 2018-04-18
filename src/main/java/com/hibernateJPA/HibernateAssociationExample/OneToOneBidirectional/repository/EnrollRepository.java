package com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.entity.EnrollmentNumber;

@Repository
public interface EnrollRepository extends JpaRepository<EnrollmentNumber,Long> {

	public EnrollmentNumber findByenroll(String enroll);
	
	public EnrollmentNumber findByid(Long id);
}
