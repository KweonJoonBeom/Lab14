package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;

public class Main { //main class
	public static void main(String[] args) // main
	{
		Scanner keyboard = new Scanner(System.in); //use Scanner function as keyboard keyword
		int num = 0; // int num =0
		Boundary arr = new Boundary(); //instance Boundary class as arr variable
		boolean repeat = true; // boolean type repeat variable
		while(repeat) //loop if repeat is true
		{
			try //try
			{
				System.out.print("Enter an integer: "); //print out Enter an integer
				num = keyboard.nextInt(); //user inputs the int type message and store in the num variable
				arr.receive(num); //use receive method
			}
			catch(ArrayIndexOutOfBoundsException e) //if catch the ArrayIndexOutOfBoundsException error
			{
				System.out.println("Invalid array index access!"); //print out error message
				repeat = false; //repeat = false
			}
		}
	}
}
