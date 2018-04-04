package edu.hangdong.csee.java.lab07.prob1;

/**
 * Class YearToCentury which contains constructors YeartoCentury which will initialize the year
 * and used in calc_century().
 * calc_century method finds which century the year is in.
 * 
 * @author Admin
 *
 */
public class YearToCentury { // declare YearToCentury Class
	int year; // declare year as an integer
	/**
	 * Default constructor method which gets year as 0
	 */
	public YearToCentury() 
	{ // declare default constructor YearToCentury
		year = 0; // year is 0;
	}
	/**
	 * Constructor method which sets year number from user input
	 * @param year
	 */
	public YearToCentury(int year)
	{ // declare public constructor YearToCentury
		this.year = year; // put user input into year

	}
	/**
	 * Method which calculates the century which the year is in
	 * by dividing year by 100 and check whether it has any leftover or not.
	 * if there isn't any 
	 * @return
	 */
	public int calc_century()
	{// declare method
		if(year % 100 == 0) // if there is any leftover after divining year by 100
			year = year / 100; // century == (year/100)
		else // else if there's some leftover years
		{
			year = (year / 100) + 1; // century == (year/100) + 1 ex.1050years = 10 + 1
		}
		return year; // return the value which will be printed as century
	}
}
