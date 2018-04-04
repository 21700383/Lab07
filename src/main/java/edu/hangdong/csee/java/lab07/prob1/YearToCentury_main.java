package edu.hangdong.csee.java.lab07.prob1;

import java.util.Scanner; // import Scanner utility to get user input

/**
 * Main class for YearToCentury
 * Gets user input for year(yr) then print out 
 * yr and result of calc_century()
 * @author Admin
 *
 */
public class YearToCentury_main { // declare YearToCentury_main function
	/**
	 * static method main
	 * @param args
	 */
	public static void main(String [] args)
	{ // declare static method main
		int yr = 0; // declare yr as integer as initialize it as 0
		Scanner keyboard = new Scanner(System.in); // to get user input from keyboard

		System.out.println("Input year: "); // print out message to make user input year
		yr = keyboard.nextInt(); // get user input as yr

		YearToCentury year = new YearToCentury(yr); // send input value of yr to set the value of year
		System.out.println(yr + " is " + year.calc_century() + "th century."); // print out year and century
	}
}
