package edu.handong.csee.java.lab14.prob4;

public class Boundary {// Boundary class
	private static int [] arr = new int[5]; // private static int tpye array variable arr that has 5 index
	private static int cnt = 0; //private int type variable cnt =0
	public void receive(int num) throws ArrayIndexOutOfBoundsException //receive method that throws ArrayIndexOutOfBoundsException
	{ 
		int i = cnt; //int i = cnt
		arr[i] = num; // arr[i] = num 
		cnt++; // cnt= cnt+1
		System.out.printf("arr[%d] <- %d\n", i, num); //print out array structure
	}
}
