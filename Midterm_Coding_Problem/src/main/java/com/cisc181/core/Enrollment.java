package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	//Create Attributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//Create private no-args Constructor
	private Enrollment(){
	}
	
	//Create 2-args Constructor
	public Enrollment(UUID my_SectionID, UUID my_StudentID){
		this.SectionID = my_SectionID;
		this.StudentID = my_StudentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	//Create getter for SectionID
	public UUID getSectionID() {
		return SectionID;
	}
	//Create setter for SectionID
	public void setSectionID(UUID my_SectionID) {
		SectionID = my_SectionID;
	}
	//Create getter for StudentID
	public UUID getStudentID() {
		return StudentID;
	}
	//Create setter for StudentID
	public void setStudentID(UUID my_StudentID) {
		StudentID = my_StudentID;
	}
	//Create getter for EnrollmentID
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	//Create setter for EnrollmentID
	public void setEnrollmentID(UUID my_EnrollmentID) {
		EnrollmentID = my_EnrollmentID;
	}
	//Create getter for Grade
	public double getGrade() {
		return Grade;
	}
	//Create setter for Grade
	public void setGrade(double my_Grade) {
		Grade = my_Grade;
	}
	
}
