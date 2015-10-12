package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;
import com.cisc181.exceptions.PersonException;

public class Student extends Person {

	private eMajor Major;
	
	private UUID StudentID;
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor my_Major)
    {
        this.Major = my_Major;           
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
    public void setStudentID(UUID StudentID){
    	this.StudentID = StudentID;
    }
    
    public Student(){
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email, UUID StudentID) 
	throws PersonException{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		this.StudentID = StudentID;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}