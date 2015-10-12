package com.cisc181.core;

import java.util.UUID;

public class Section {
	//Create attributes
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	//Create no-args constructor
	public Section(){
	}

	//Create getter for CourseID
	public UUID getCourseID() {
		return this.CourseID;
	}
	//Create setter for CourseID
	public void setCourseID(UUID my_CourseID) {
		this.CourseID = my_CourseID;
	}
	//Create getter for SemesterID
	public UUID getSemesterID() {
		return this.SemesterID;
	}
	//Create setter for SemesterID
	public void setSemesterID(UUID my_SemesterID) {
		this.SemesterID = my_SemesterID;
	}
	//Create getter for SectionID
	public UUID getSectionID() {
		return this.SectionID;
	}
	//Create setter for SectionID
	public void setSectionID(UUID my_SectionID) {
		this.SectionID = my_SectionID;
	}
	//Create getter for RoomID
	public int getRoomID() {
		return this.RoomID;
	}
	//Create setter for RoomID
	public void setRoomID(int my_RoomID) {
		this.RoomID = my_RoomID;
	}
	
}
