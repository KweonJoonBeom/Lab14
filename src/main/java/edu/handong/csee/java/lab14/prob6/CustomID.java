package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception{ //CustomID class that extends Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"}; //String type races array
	private String name = ""; // string type name variable
	private int age = 0; // int type age = 0
	private String race = ""; //String type race 
	private int state = 0; // int type state 

	public void set_name(String str) throws Exception // set_name method that throws Exception
	{
		if(str.length() < 5) { // if str length <5
			state = 0; // state is zero
			throw new Exception("Your name is short! Try again!"); // print out rewrite message
		}

		else { // else 
			this.name = str; //this class's name = str 
			System.out.println("Name is valid"); //print out ok message 
			System.out.println("Name: " + this.name); //print out name
			state++; //state = state +1
		}
	}



	public void set_age(int num) throws Exception //set_age method that throws Exception
	{
		if(num < 18) { // if num<18
			state = 1; //state = 1
			throw new Exception("You are too young! Try again!"); // print out rewrite message
		}
		else { // else 
			this.age = num; // this class's age = num
			System.out.println("Age is valid"); // print out ok message 
			System.out.println("Age: " + this.age); // print out age 
			state++; //state = state + 1
		}
	}

	public void set_race(String race) throws Exception{ //set_race method that throws Exception
		for(int i = 0; i < races.length; i++) // for loop until i<races.length
		{
			if(races[i].equals(race)) { // if races[i].equals is true then loop below contens
				this.race = races[i]; // this.race = races[i]
				System.out.println("Race is valid"); //print out ok message 
				System.out.println("Race: " + races[i]); //print out race 
				state = 0; //stat = 0
				return; //end  
			}
		}
		state = 2; //else state = 2
		throw new Exception("Human! Try again."); // print out error message
	}
	public int getState() //getState method 
	{
		return state;// return state
	}
}
