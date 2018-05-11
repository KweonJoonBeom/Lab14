package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner; //import scanner to use this method
import java.util.Random; //use Random method 


public class Main { //main class

	public static void main(String[] args) { // main method 
		Scanner keyboard = new Scanner(System.in); //instance Scanner class
		Random rand = new Random(); // instance random class
		int limit = 0;  // int type limit variable
		int speed = 0; //int type speed variable

		System.out.print("Set the speed limit, officer: "); //print out some message
		limit = keyboard.nextInt(); //be inputed by user some int typee message 
		speed = rand.nextInt(101); //be inputed by user some int typee message

		SpeedLimiter lim = new SpeedLimiter(limit, speed); //instance SpeedLimiter class

		lim.warnSpeedLimit(); // use warnSpeedLimit method

		keyboard.close(); // close

	}

}
