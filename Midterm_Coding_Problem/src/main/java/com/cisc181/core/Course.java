package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	//Create attributes
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	//Create no-args Constructor
	public Course(){
	}
	
	//Create getter for CourseID
	public UUID getCourseID() {
		return this.CourseID;
	}
	//Create setter for CourseID
	public void setCourseID(UUID my_CourseID) {
		this.CourseID = my_CourseID;
	}
	//Create getter for CourseName
	public String getCourseName() {
		return this.CourseName;
	}
	//Create setter for CourseName
	public void setCourseName(String my_CourseName) {
		this.CourseName = my_CourseName;
	}
	//Create getter for GradePoints
	public int getGradePoints() {
		return this.GradePoints;
	}
	//Create setter for GradePoints
	public void setGradePoints(int my_GradePoints) {
		this.GradePoints = my_GradePoints;
	}
	//Create getter for Major
	public eMajor getMajor(){
		return this.Major;
	}
	//Create setter for Major
	public void setMajor(eMajor my_Major){
		this.Major = my_Major;
	}
	
	
}
