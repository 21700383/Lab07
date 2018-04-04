package edu.handong.csee.java.lab07.prob3;

import java.util.*; 

/**
 * Attendance class with constructors to set the value of the student's name, year, student id and number of absence.
 * There are also getters to get the student's name, year, student id and number of absence(missed).
 * Finally, absence_check method checks the number of absence print the message if the conditions meet.
 * @author Admin
 *
 */
public class Attendance {
	private String name = ""; // declare name as private string only used in this class
	private int year = 0; // declare year as private integer only used in this class
	private String student_id = "";// declare student_id as private string only used in this class
	private int missed = 0;// declare missed as private integer only used in this class

	//Constructors
	/**
	 * Constructor class which will run if there is no user input
	 */
	public Attendance()
	{// declare public constructor method
		this.name = "Null"; // put called student's name as null;
		this.year = 0; // put called student's year as 0;
		this.student_id = "Null";// put called student's student id as null;
		this.missed = 0; // put called student's missed(number of absence) as 0;
	}
	/**
	 * Constructor class which gets user input and set them to 
	 * the called student's name, year, student_id and missed
	 */
	public Attendance(String name, int year, String student_id, int missed)
	{ //declare public constructor method
		this.name = name; // put called student's name as user input;
		this.year = year; // put called student's year as user input;
		this.student_id = student_id;// put called student's student id as user input;
		this.missed = missed;// put called student's missed(number of absence) as user input;
	}

	//Getters
	/**
	 * Get method which returns name of the called student
	 */
	public String get_name()
	{ // declare public getter method
		return name; // return called student's name
	}
	/**
	 * Get method which returns year of the called student
	 */
	public int get_year()
	{// declare public getter method
		return year; // return called student's year
	}
	/**
	 * Get method which returns student_id of the called student
	 */
	public String get_id()
	{// declare public getter method
		return student_id; // return called student's student_id
	}
	/**
	 * Get method which returns missed(number of absents) of the called student
	 */
	public int get_missed()
	{// declare public getter method
		return missed; // return called student's missed
	}

	//Setters
	/**
	 * Set method which set the called student's name to user input
	 */
	public void set_name(String name)
	{// declare public setter method
		this.name = name; // set value of called student's name to input
	}
	/**
	 * Set method which set the called student's year to user input
	 */
	public void set_year(int year)
	{// declare public setter method
		this.year = year; // set value of called student's year to input
	}
	/**
	 * Set method which set the called student's student_id to user input
	 */
	public void set_id(String student_id)
	{// declare public setter method
		this.student_id = student_id; // set value of called student's student_id to input
	}
	/**
	 * Set method which set the called student's missed to user input
	 */
	public void set_missed(int missed)
	{// declare public setter method
		this.missed = missed; // set value of called student's missed to input
	}

	/**
	 * absence_check method which checks the called student's missed and if the missed if more than 6,
	 * print the message that the student failed and print number of absence
	 */
	public void absence_check() 
	{// declare method
		if(this.get_missed() > 6) { // if the called student's missed is more than 6
			System.out.println("I'm sorry " + this.get_name() + ". You fail this course"); // print message the student failed the course
			System.out.println(this.get_name() + " - Number of absence: " + this.get_missed()); // print number of absence
		}
	}
}

