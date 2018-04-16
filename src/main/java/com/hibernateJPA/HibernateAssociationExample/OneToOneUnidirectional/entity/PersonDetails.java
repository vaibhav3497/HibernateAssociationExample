package com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * PassportDetails class persist with persondetails database table We are using
 * persondetails table to store passport related data in then use that row
 * unique id as a foriegn key in person table to map person passport related
 * details to the passport holder person
 *
 */
@Entity
@Table(name = "persondetails")
public class PersonDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "passportid")
	@NotNull
	private String passportId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
}
