package com.hibernateJPA.HibernateAssociationExample.OneToOneBidirectional.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studetnid;

	@Column
	private String studentname;

	@OneToOne(mappedBy = "student")
	private EnrollmentNumber enrollnumber;

	public Long getStudetnid() {
		return studetnid;
	}

	public void setStudetnid(Long studetnid) {
		this.studetnid = studetnid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public EnrollmentNumber getEnrollnumber() {
		return enrollnumber;
	}

	public void setEnrollnumber(EnrollmentNumber enrollnumber) {
		this.enrollnumber = enrollnumber;
	}

}
