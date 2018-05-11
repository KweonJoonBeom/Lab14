package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class Main { // main class
	public static final Powercalc my_calculator = new Powercalc(); //instance Powercalc class
	public static final Scanner in = new Scanner(System.in); //instance Scanner function

	public static void main(String[] args) { //main
		while (in.hasNextInt()) { // loop below contents if in hasNextInt() => if user input the something 
			int n = in.nextInt(); // n = in.nextInt() => user input 
			int p = in.nextInt(); // p = in.nextInt() = user input

			try { // try 
				System.out.println(my_calculator.checkPower(n, p)); //print out n power p 
			} catch (Exception e) { //catch exception
				System.out.println(e); //print out error message
			}
		}
	}


}
