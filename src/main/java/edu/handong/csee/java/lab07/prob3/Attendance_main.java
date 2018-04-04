package edu.handong.csee.java.lab07.prob3;
import java.util.Random; // import Random utility to generate random number

/**
 * Main class for Attendance which initialize the name, year, student_id of a student and set all missed(absents) as 0;
 * Then number of missed will be randomly generated for each student and will be checked for each one to see
 * whether they missed more than 6 classes.
 * If the student's miss is over 6, message will printed out that the student failed the course and 
 * shows the number of absents.
 * @author Admin
 *
 */
public class Attendance_main {
	/**
	 * static main method for Attendance_main
	 * @param args
	 */
	public static void main(String[] args) {
		Attendance s_1 = new Attendance("Jess", 4 , "21400999" ,0); // set student no.1's name, year, student_id, missed
		Attendance s_2 = new Attendance("Kent", 2 , "21700111" ,0); // set student no.2's name, year, student_id, missed
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); // set student no.3's name, year, student_id, missed
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0); // set student no.4's name, year, student_id, missed

		Random randomGenerator = new Random(); // to generate random numbers

		s_1.set_missed(randomGenerator.nextInt(10)); // randomly generate student no.1's missed
		s_2.set_missed(randomGenerator.nextInt(10)); // randomly generate student no.1's missed
		s_3.set_missed(randomGenerator.nextInt(10)); // randomly generate student no.1's missed
		s_4.set_missed(randomGenerator.nextInt(10)); // randomly generate student no.1's missed

		s_1.absence_check(); // check number of absence of a student and print fail message if needed
		s_2.absence_check(); // check number of absence of a student and print fail message if needed
		s_3.absence_check(); // check number of absence of a student and print fail message if needed
		s_4.absence_check(); // check number of absence of a student and print fail message if needed
	}

}
// last commit?
