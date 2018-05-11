package edu.handong.csee.java.lab14.prob3;

public class Powercalc {// Powercalc class
	public long checkPower(int n, int p) throws Exception //checkPower class that throws Exception fucntion
	{
		long result = 0; // long type result =0

		result = (long)Math.pow(n, p); //use math.pow method that n power of p 
		if(n < 0 || p < 0) //if n or p is negative
		{
			throw new Exception("n or p should not be negative."); //print out error message
		}
		if(n == 0 && p == 0) // if n and p is zero
		{
			throw new Exception("n and p should not be zero."); //print out error message
		}
		return result; //else return value
	}
}
