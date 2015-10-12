package com.cisc181.core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cisc181.exceptions.PersonException;

/*
 * comment
 */
public abstract class Person {

	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() {
		return DOB;
	}
	
	//Added new exception "PersonException" to setDOB
	public void setDOB(Date DOB)
	throws PersonException{
		
		
		//Create current date
		Date now = new Date();
		
		//Format dates and convert to integers
		Integer current_year = Integer.parseInt(String.format("%tY",now));
		Integer current_month = Integer.parseInt(String.format("%tm",now));
		Integer current_day = Integer.parseInt(String.format("%ty",now));
	
		//Manipulate DOB
		Integer DOB_year = Integer.parseInt(String.format("%tY", DOB));
		Integer DOB_month = Integer.parseInt(String.format("%tm", DOB));
		Integer DOB_day = Integer.parseInt(String.format("%td", DOB));
	
		//Determine whether to throw exception
		if ((current_year - DOB_year) < 100){
			this.DOB = DOB;
		}
		else if((current_year - DOB_year) == 100 &&
				((current_month - DOB_month) > 0)){
			this.DOB = DOB;
		}
		else if((current_year - DOB_year) == 100 &&
				((current_month - DOB_month) == 0) &&
				((current_day - DOB_day) >= 0)){
			this.DOB = DOB;
		}
		//throw exception PersonException if conditions fail
		else{
			throw new PersonException(this);
		}
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}
	
	//Added new exception "PersonException" to setPhone
	public void setPhone(String newPhone_number)
	throws PersonException {
		//Create regex variables to evaluate newPhone_number
		String my_regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern my_pattern = Pattern.compile(my_regex);
		Matcher my_matcher = my_pattern.matcher(newPhone_number);
		
		/*Throw PersonException if newPhone_number
		* does not contain nine integers */
		if (my_matcher.matches() == false){
			throw new PersonException(this);
		}
		/*Throw PersonException if newPhone number does not
		 * have form (###)-###-####*/
		else if (newPhone_number != my_matcher.replaceFirst("($1) $2-$3")){
			throw new PersonException(this);
		}
		//Else, set phone_number to newPhone_number
		else{
			phone_number = newPhone_number;
		}
	}

	public String getPhone() {
		return phone_number;
	}

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Person(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email) 
	throws PersonException{
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		setDOB(DOB);
		this.address = Address;
		setPhone(Phone_number);
		this.email_address = Email;	
	}

	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	public void PrintDOB() {
		System.out.println(this.DOB);
	}

	public int PrintAge() {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
}