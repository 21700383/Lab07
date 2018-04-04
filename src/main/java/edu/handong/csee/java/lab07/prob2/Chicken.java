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
	 * Constructor method which would run if nothing is input, setting everything to 0.
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
	{  // declare public setter method Chicken
		this.name = name; // put user input of name into the called menu's name
		this.price = price; // put user input of price into the called menu's name
		this.stars = stars; // put user input of stars into the called menu's starts
	}
	/**
	 * Get method which returns the value of the called method's name
	 * @return
	 */
	public String get_name()
	{ // declare method
		return this.name; // return the menu's name
	}
	/**
	 * Get method which returns the value of the called method's price
	 * @return
	 */
	public double get_price()
	{ // declare method
		return this.price; // return the menu's price
	}
	/**
	 * Get method which returns the value of the called method's stars
	 * @return
	 */
	public int get_stars()
	{// declare method
		return this.stars; // return the menu's rating/stars
	}
	/**
	 * Set method which changes the called menu's name to the input value
	 * @return
	 */
	public void set_name(String name)
	{// declare method
		this.name = name; // change the menu's name to input
	}
	/**
	 * Set method which changes the called menu's price to the input value
	 * @return
	 */
	public void set_price(double price)
	{// declare method
		this.price = price;// change the menu's price to input
	}
	/**
	 * Set method which changes the called menu's stars to the input value
	 * @return
	 */
	public void set_stars(int stars)
	{// declare method
		this.stars = stars;// change the menu's stars to input
	}

}
