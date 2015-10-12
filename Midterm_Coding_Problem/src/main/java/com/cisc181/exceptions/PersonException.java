package com.cisc181.exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person person;
	
	public PersonException(Person my_person){
		super("Invalid Phone number or DOB on person: "+ my_person);
		System.out.println(" All DOB must be within 100 years of" +
				"the current date. All phone numbers must formatted"
				+ " as: (###)-###-####");
		this.person = my_person;
	}
	
	public Person getPerson(){
		return person;
	}
}
