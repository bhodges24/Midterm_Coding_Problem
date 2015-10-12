package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_JUnit {

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
	public void Change_Major_Test() {
		Student student_1 = new Student();
		student_1.setMajor(eMajor.PHYSICS);
		assertTrue(student_1.getMajor() == eMajor.PHYSICS);
		student_1.setMajor(eMajor.CHEM);
		assertTrue(student_1.getMajor() == eMajor.CHEM);
	}

	@Test
	public void Enrollment_Test_Student_1() {
		// Create 3 Courses
		Course course_1 = new Course();
		Course course_2 = new Course();
		Course course_3 = new Course();

		// Add courses to an ArrayList
		ArrayList<Course> my_courses = new ArrayList<Course>();
		my_courses.add(course_1);
		my_courses.add(course_2);
		my_courses.add(course_3);

		// Create Fall & Spring Semesters
		Semester fall_semester = new Semester();
		Semester spring_semester = new Semester();

		// Add semesters to an ArrayList
		ArrayList<Semester> my_semesters = new ArrayList<Semester>();
		my_semesters.add(fall_semester);
		my_semesters.add(spring_semester);

		// Create Sections
		Section section_f_c1 = new Section();
		Section section_f_c2 = new Section();
		Section section_f_c3 = new Section();
		Section section_s_c1 = new Section();
		Section section_s_c2 = new Section();
		Section section_s_c3 = new Section();

		// Create ArrayList of Sections
		ArrayList<Section> my_sections = new ArrayList<Section>();
		my_sections.add(section_f_c1);
		my_sections.add(section_f_c2);
		my_sections.add(section_f_c3);
		my_sections.add(section_s_c1);
		my_sections.add(section_s_c2);
		my_sections.add(section_s_c3);

		// Create 10 students
		Student student_1 = new Student();
		Student student_2 = new Student();
		Student student_3 = new Student();
		Student student_4 = new Student();
		Student student_5 = new Student();
		Student student_6 = new Student();
		Student student_7 = new Student();
		Student student_8 = new Student();
		Student student_9 = new Student();
		Student student_10 = new Student();

		// Create ArrayList of students
		ArrayList<Student> my_students = new ArrayList<Student>();
		my_students.add(student_1);
		my_students.add(student_2);
		my_students.add(student_3);
		my_students.add(student_4);
		my_students.add(student_5);
		my_students.add(student_6);
		my_students.add(student_7);
		my_students.add(student_8);
		my_students.add(student_9);
		my_students.add(student_10);

		// Create ArrayList of Enrollments
		ArrayList<Enrollment> my_enrollments = new ArrayList<Enrollment>();

		// Enroll each student in each section of my_sections
		for (Student stu : my_students) {
			for (Section sect : my_sections) {
				// Create new enrollment
				Enrollment e = new Enrollment(sect.getSectionID(), stu.getStudentID());

				// Grade each student
				e.setGrade(90.0);
				// Add enrollment to the ArrayList
				my_enrollments.add(e);
			}
		}

		// PART 1

		// Determine GPA for student_1
		double student_1_GPA = ((my_enrollments.get(0).getGrade() + my_enrollments.get(1).getGrade()
				+ my_enrollments.get(2).getGrade() + my_enrollments.get(3).getGrade() + my_enrollments.get(4).getGrade()
				+ my_enrollments.get(5).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_1_GPA == 90.0);

		// Determine GPA for student_2
		double student_2_GPA = ((my_enrollments.get(6).getGrade() + my_enrollments.get(7).getGrade()
				+ my_enrollments.get(8).getGrade() + my_enrollments.get(9).getGrade()
				+ my_enrollments.get(10).getGrade() + my_enrollments.get(11).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_2_GPA == 90.0);

		// Determine GPA for student_3
		double student_3_GPA = ((my_enrollments.get(12).getGrade() + my_enrollments.get(13).getGrade()
				+ my_enrollments.get(14).getGrade() + my_enrollments.get(15).getGrade()
				+ my_enrollments.get(16).getGrade() + my_enrollments.get(17).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_3_GPA == 90.0);

		// Determine GPA for student_4
		double student_4_GPA = ((my_enrollments.get(18).getGrade() + my_enrollments.get(19).getGrade()
				+ my_enrollments.get(20).getGrade() + my_enrollments.get(21).getGrade()
				+ my_enrollments.get(22).getGrade() + my_enrollments.get(23).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_4_GPA == 90.0);

		// Determine GPA for student_5
		double student_5_GPA = ((my_enrollments.get(24).getGrade() + my_enrollments.get(25).getGrade()
				+ my_enrollments.get(26).getGrade() + my_enrollments.get(27).getGrade()
				+ my_enrollments.get(28).getGrade() + my_enrollments.get(29).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_5_GPA == 90.0);

		// Determine GPA for student_6
		double student_6_GPA = ((my_enrollments.get(30).getGrade() + my_enrollments.get(31).getGrade()
				+ my_enrollments.get(32).getGrade() + my_enrollments.get(33).getGrade()
				+ my_enrollments.get(34).getGrade() + my_enrollments.get(35).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_6_GPA == 90.0);

		// Determine GPA for student_7
		double student_7_GPA = ((my_enrollments.get(36).getGrade() + my_enrollments.get(37).getGrade()
				+ my_enrollments.get(38).getGrade() + my_enrollments.get(39).getGrade()
				+ my_enrollments.get(40).getGrade() + my_enrollments.get(41).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_7_GPA == 90.0);

		// Determine GPA for student_8
		double student_8_GPA = ((my_enrollments.get(42).getGrade() + my_enrollments.get(43).getGrade()
				+ my_enrollments.get(44).getGrade() + my_enrollments.get(45).getGrade()
				+ my_enrollments.get(46).getGrade() + my_enrollments.get(47).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_8_GPA == 90.0);

		// Determine GPA for student_9
		double student_9_GPA = ((my_enrollments.get(48).getGrade() + my_enrollments.get(49).getGrade()
				+ my_enrollments.get(50).getGrade() + my_enrollments.get(51).getGrade()
				+ my_enrollments.get(52).getGrade() + my_enrollments.get(53).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_9_GPA == 90.0);

		// Determine GPA for student_10
		double student_10_GPA = ((my_enrollments.get(54).getGrade() + my_enrollments.get(55).getGrade()
				+ my_enrollments.get(56).getGrade() + my_enrollments.get(57).getGrade()
				+ my_enrollments.get(58).getGrade() + my_enrollments.get(59).getGrade()) / 6);
		//Test if AVG correct
		assertTrue(student_10_GPA == 90.0);

		// PART 2

		// Determine AVG for course_1
		double course_1_AVG = ((my_enrollments.get(0).getGrade() + my_enrollments.get(6).getGrade()
				+ my_enrollments.get(12).getGrade() + my_enrollments.get(18).getGrade()
				+ my_enrollments.get(24).getGrade() + my_enrollments.get(30).getGrade()
				+ my_enrollments.get(36).getGrade() + my_enrollments.get(42).getGrade()
				+ my_enrollments.get(48).getGrade() + my_enrollments.get(54).getGrade()) / 10);
		//Test if AVG correct
		assertTrue(course_1_AVG == 90.0);

		// Determine AVG for course_2
		double course_2_AVG = ((my_enrollments.get(1).getGrade() + my_enrollments.get(7).getGrade()
				+ my_enrollments.get(13).getGrade() + my_enrollments.get(19).getGrade()
				+ my_enrollments.get(25).getGrade() + my_enrollments.get(31).getGrade()
				+ my_enrollments.get(37).getGrade() + my_enrollments.get(43).getGrade()
				+ my_enrollments.get(49).getGrade() + my_enrollments.get(55).getGrade()) / 10);
		//Test if AVG correct
		assertTrue(course_2_AVG == 90.0);

		// Determine AVG for course_3
		double course_3_AVG = ((my_enrollments.get(2).getGrade() + my_enrollments.get(8).getGrade()
				+ my_enrollments.get(14).getGrade() + my_enrollments.get(20).getGrade()
				+ my_enrollments.get(26).getGrade() + my_enrollments.get(32).getGrade()
				+ my_enrollments.get(38).getGrade() + my_enrollments.get(44).getGrade()
				+ my_enrollments.get(50).getGrade() + my_enrollments.get(56).getGrade()) / 10);
		//Test if AVG correct
		assertTrue(course_3_AVG == 90.0);

		// Determine AVG for course_4
		double course_4_AVG = ((my_enrollments.get(3).getGrade() + my_enrollments.get(9).getGrade()
				+ my_enrollments.get(15).getGrade() + my_enrollments.get(21).getGrade()
				+ my_enrollments.get(27).getGrade() + my_enrollments.get(33).getGrade()
				+ my_enrollments.get(39).getGrade() + my_enrollments.get(45).getGrade()
				+ my_enrollments.get(51).getGrade() + my_enrollments.get(57).getGrade()) / 10);
		//Test if AVG correct
		assertTrue(course_4_AVG == 90.0);

		// Determine AVG for course_5
		double course_5_AVG = ((my_enrollments.get(4).getGrade() + my_enrollments.get(10).getGrade()
				+ my_enrollments.get(16).getGrade() + my_enrollments.get(22).getGrade()
				+ my_enrollments.get(28).getGrade() + my_enrollments.get(34).getGrade()
				+ my_enrollments.get(40).getGrade() + my_enrollments.get(46).getGrade()
				+ my_enrollments.get(52).getGrade() + my_enrollments.get(58).getGrade()) / 10);
		assertTrue(course_5_AVG == 90.0);

		// Determine AVG for course_1
		double course_6_AVG = ((my_enrollments.get(5).getGrade() + my_enrollments.get(11).getGrade()
				+ my_enrollments.get(17).getGrade() + my_enrollments.get(23).getGrade()
				+ my_enrollments.get(29).getGrade() + my_enrollments.get(35).getGrade()
				+ my_enrollments.get(41).getGrade() + my_enrollments.get(47).getGrade()
				+ my_enrollments.get(53).getGrade() + my_enrollments.get(59).getGrade()) / 10);
		//Test if AVG correct
		assertTrue(course_6_AVG == 90.0);

	}

}
