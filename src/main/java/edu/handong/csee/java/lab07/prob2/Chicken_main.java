package edu.handong.csee.java.lab07.prob2;

/**
 * Main class for Chicken.
 * initialize name and rating for menu1,2,3
 * and print out the name and the rating at the end.
 * @author Admin
 *
 */
public class Chicken_main { //declare class Chicken_main
	public static void main(String[] args) { //declare static method main which will run only once
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); // set name, price and rating for menu1
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5); // set name, price and rating for menu2
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);// set name, price and rating for menu3

		menu1.set_stars(3); // call set_stars to set menu1's rating as 3
		menu2.set_stars(4); // call set_stars to set menu2's rating as 4
		menu3.set_stars(1); // call set_stars to set menu3's rating as 1

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); // print out menu1's name and rating 
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars()); // print out menu2's name and rating
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars()); // print out menu3's name and rating
	}

}
