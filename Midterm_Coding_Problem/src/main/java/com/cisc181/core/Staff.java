package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

//Changed type of "Title" to enum eTitle
public class Staff extends Employee {

	 private eTitle Title;

	   public Staff(eTitle my_Title){
	        this.Title = my_Title;
	    }

	    public void setTitle(eTitle my_Title){
	        this.Title = my_Title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

   
    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) 
	
	throws PersonException{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}