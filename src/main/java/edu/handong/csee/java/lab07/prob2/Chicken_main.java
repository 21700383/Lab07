package edu.handong.csee.java.lab07.prob2;

public class Chicken_main {
public static void main(String[] args) {
Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);
Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);
Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);

menu1.set_stars(3);
menu2.set_stars(4);
menu3.set_stars(1);

System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());
System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());
System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());
}

}
