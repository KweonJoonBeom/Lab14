package edu.handong.csee.java.lab14.prob2;
import java.util.*; //import every java library function 

public class In_exception { //In_exception class
	private int x = 0, y = 0; // private int type variable x and y =0

	public In_exception() {} //this class's constructor 

	public void error_det() { //error_det method

		try{ //try
			Scanner keyboard = new Scanner(System.in); //instance Scanner funtion
			System.out.print("x: "); //print out x
			x = keyboard.nextInt(); //inputed by user some int type and store in x
			System.out.print("y: "); // print out y
			y = keyboard.nextInt(); // inputed by user some int type and store in x
			System.out.println(this.x/this.y); // print out variable x , y 
		}
		catch(ArithmeticException e){ //if catch 'ArithmeticException' error
			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); //print out error message
		}
		catch(InputMismatchException e){ //if catch 'InputMismatchException' error
			System.out.println("java.util.InputMismatchException"); //print out error message
		}
		catch(Exception e) { // if catch else error 
			System.out.println("Some other exception has occurred: " + e.getMessage()); //print out that message
		}
	}
}
