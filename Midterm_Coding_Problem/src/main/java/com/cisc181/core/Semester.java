package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	//Create attributes
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	//Create no-args constructor
	public Semester(){
	}
	
	//Create getter for SemesterID
	public UUID getSemesterID() {
		return this.SemesterID;
	}
	//Create setter for SemesterID
	public void setSemesterID(UUID my_SemesterID) {
		this.SemesterID = my_SemesterID;
	}
	//Create getter for StartDate
	public Date getStartDate() {
		return this.StartDate;
	}
	//Create setter for StartDate
	public void setStartDate(Date my_StartDate) {
		this.StartDate = my_StartDate;
	}
	//Create getter for EndDate
	public Date getEndDate() {
		return this.EndDate;
	}
	//Create setter for EndDate
	public void setEndDate(Date my_EndDate) {
		this.EndDate = my_EndDate;
	}
	
}
