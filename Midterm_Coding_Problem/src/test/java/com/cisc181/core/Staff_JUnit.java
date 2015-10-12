package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_JUnit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void SalaryTest() {
		//Create 5 new Staff Members
		Staff Staff_1 = new Staff(eTitle.DINING);
		Staff Staff_2 = new Staff(eTitle.CUSTODIAL);
		Staff Staff_3 = new Staff(eTitle.ADMINISTRATION);
		Staff Staff_4 = new Staff(eTitle.CUSTODIAL);
		Staff Staff_5 = new Staff(eTitle.DINING);
		
		//Set salary for each of the five
		Staff_1.setSalary(30000.00);
		Staff_2.setSalary(25000.00);
		Staff_3.setSalary(40000.00);
		Staff_4.setSalary(25000.00);
		Staff_5.setSalary(30000.00);
		
		//Create ArrayList and add each staff member
		ArrayList<Staff> my_staff_list = new ArrayList<Staff>();
		my_staff_list.add(Staff_1);
		my_staff_list.add(Staff_2);
		my_staff_list.add(Staff_3);
		my_staff_list.add(Staff_4);
		my_staff_list.add(Staff_5);
		
		//Loop over entries in my_staff_list
		double sum = 0;
		for(Staff staff: my_staff_list){
			sum += staff.getSalary();
		}
		//Calculate average 
		double AVG_Salary = sum/(my_staff_list.size());
		
		//Check if Calculation is correct
		assertTrue(AVG_Salary == 30000.00);
	}
	
	@Test
	public void InvalidDOBTest() {
		Staff staff_1 = new Staff(eTitle.CUSTODIAL);
		@SuppressWarnings("deprecation")
		Date my_DOB = new Date(1900, 03, 14);
		try {
			staff_1.setDOB(my_DOB);
		} catch (PersonException ex) {
			System.out.println(ex);
		}

	}
	
	@Test
	public void InvalidPhoneNumberTest() {
		Staff staff_1 = new Staff(eTitle.DINING);
		String my_PhoneNumber = "345-980-4564";
		try{
			staff_1.setPhone(my_PhoneNumber);
		} catch(PersonException ex) {
			System.out.println(ex);
		}
				
		
	}

}
