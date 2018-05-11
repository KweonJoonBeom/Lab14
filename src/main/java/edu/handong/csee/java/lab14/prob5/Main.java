package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class Main { // main
	public static void main(String[] a){ // main
		try{ // try 
			Scanner keyboard = new Scanner(System.in); // use Scanner method as keyboard keyword
			String str = keyboard.nextLine(); // String type str 
			Main.myTest(str); // use myTest method
		} catch(MyException mae){ // if catch the MyException error
			System.out.println("Inside catch block: " + mae); //print out error message
		}
	}

	static void myTest(String str) throws MyException{ // myTest method that throws MyException
		if(str.equals("null")){ //iff str.equals("null") is true
			throw new MyException("String val is null"); // print out string is null 
		}
		else // else
			System.out.println("String val is:" + str); // print out message
	}
}

