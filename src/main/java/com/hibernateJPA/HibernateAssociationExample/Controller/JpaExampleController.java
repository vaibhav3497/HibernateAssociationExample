package com.hibernateJPA.HibernateAssociationExample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.entity.Customer;
import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.entity.Phone;
import com.hibernateJPA.HibernateAssociationExample.OneToManyUniDirectional.service.CustomerServiceI;
import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.entity.Person;
import com.hibernateJPA.HibernateAssociationExample.OneToOneUnidirectional.service.PersonServiceI;

@RestController
public class JpaExampleController {

	@Autowired
	private PersonServiceI personServiceI;

	@Autowired
	private CustomerServiceI customerSericeI;

	@PostMapping("/add/personRecord/")
	public void addPerson(@RequestBody Person person) {
		/*
		 * Person person = new Person(); person.setFirstName("vaibhav");
		 * person.setLastName("prajapati"); PersonDetails personDetails = new
		 * PersonDetails(); personDetails.setPassportId("1234567");
		 * person.setPersonDetails(personDetails);
		 */
		personServiceI.inserPersonRecord(person);
	}

	/*
	 * @RequestMapping(value = "/get/personRecord/{personid}", method =
	 * RequestMethod.GET) public @ResponseBody Person
	 * retivePersonDetailsById(@PathVariable Long personid) { return
	 * personServiceI.getPersonById(personid); }
	 */

	@PostMapping(value = "/get/personRecordById/")
	public @ResponseBody Person retivePersonDetailsById(@RequestBody String personid) {
		return personServiceI.getPersonById(Long.parseLong(personid));
	}

	@PostMapping("/get/customer/data/by/id")
	public Customer findCustomerById(String id) {
		return customerSericeI.findCustomerById(Long.parseLong(id));
	}

	@PostMapping("/add/customer/")
	public void addCustomer() {
		Customer customer = new Customer();
		customer.setFirstName("vaibhav");
		customer.setLastName("prajapati");
		Phone p1 = new Phone();
		p1.setContactNumber("9099665459");
		Phone p2 = new Phone();
		p2.setContactNumber("9687505848");
		customer.getContactnumber().add(p1);
		customer.getContactnumber().add(p2);
		customerSericeI.addCustomer(customer);
	}

}
