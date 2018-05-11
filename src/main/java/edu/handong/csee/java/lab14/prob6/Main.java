package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;

public class Main { // Main class
	public static void main(String[] args) // main
	{
		String name, race; // String name,race 
		int age = 0; // int type age = 0 
		Scanner keyboard = new Scanner(System.in); // instance Scanner method 
		CustomID obj = new CustomID(); // instance CustomID class as obj variable
		boolean repeat = true; // boolean type repeat = true

		while(repeat) // loop is repeat = true
		{
			try { // try
				if(obj.getState() == 0) { // if obj.getState() =0
					System.out.print("Enter your name: "); //print out Enter your name
					name = keyboard.nextLine(); // name = user input String
					obj.set_name(name); // use set_name method
				}
				else if(obj.getState() == 1) { //if obj.getStae() =1 
					System.out.print("Enter your age: "); //print out Enter your age 
					age = keyboard.nextInt(); // age = user input integer
					keyboard.nextLine(); // inputting 
					obj.set_age(age); // use set_age method 
				}
				else if(obj.getState() == 2) { //if obj.getState() =2 
					System.out.print("Enter your race: "); //print out Enter your race 
					race = keyboard.nextLine(); // race= user input String 
					obj.set_race(race); // use set_race method
				}
			}
			catch(Exception e){ // if catch the user handling exception 
				System.out.println(e.getMessage()); //print out error message
				continue; //repeat the loop
			}
		}
	}
}

