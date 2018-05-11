package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiter { //SpeedLimiter class
	private int speed = 0; // private int type variable speed
	private int limit = 0; //private int type variable limit

	public SpeedLimiter(int limit, int speed) //constructor of this class
	{
		this.limit = limit; //this class's limit = inputed limit variable
		this.speed = speed; //this class's speed = inputed speed variable
	}

	public void warnSpeedLimit() //warnSpeedLimit method
	{
		try { //using try catch 
			if(this.speed > this.limit) //if this class's speed > limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); //print out exception message  
			}
			System.out.println("You are a law abiding citizen!"); // print out message
		}catch(Exception e) { // catch error exception
			System.out.println(e.getMessage()); // print out exception message 
			System.out.println("You are being fined. "); // print out 
		}
		System.out.println("Your current speed: " + this.speed); //print out current speed
	}
}


