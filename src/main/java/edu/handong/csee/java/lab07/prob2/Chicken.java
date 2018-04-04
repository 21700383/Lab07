package edu.handong.csee.java.lab07.prob2;

/**
 * Chicken class having get and set method to put the user input into menu.
 * Name, price, rating(star) is received from the user input in main
 * and set menu's name,price and rating.
 * Get methods are used when printing the menu's values.
 * @author Admin
 *
 */
public class Chicken {
	private String name; // declare name as private string only used in this class
	private double price; // declare price as private double only used in this class
	private int stars; // declare stars as private int and stars will be otherwise called rating
	/**
	 * Default constructor method which would run if nothing is input, setting everything to 0.
	 */
	public Chicken()
	{ // declare Chicken method
		this.name = ""; // set the name of the called menu to nothing
		this.price = 0.0; // set the price of the called menu to 0
		this.stars = 0; // set the stars of the called menu to 0
	}
	/**
	 * Constructor method which gets the user input and set them to the called menu's name, price and starts
	 * @param name
	 * @param price
	 * @param stars
	 */
	public Chicken(String name, double price, int stars)
	{  // declare 
		this.name = name;
		this.price = price;
		this.stars = stars;
	}

	public String get_name()
	{
		return this.name;
	}

	public double get_price()
	{
		return this.price;
	}

	public int get_stars()
	{
		return this.stars;
	}

	public void set_name(String name)
	{
		this.name = name;
	}

	public void set_price(double price)
	{
		this.price = price;
	}
	public void set_stars(int stars)
	{
		this.stars = stars;
	}

}
