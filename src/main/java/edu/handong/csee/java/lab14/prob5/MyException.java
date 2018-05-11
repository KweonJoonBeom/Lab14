package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception { // MyException class that extends Exception
private String message = null; // String message variable =null
 
    public MyException() { //constructor 
        super(); //use parent's constructor 
    }
 
    public MyException(String message) {  //constructor of this class
        super(message); //use parent's constructor
        this.message = message; // this class's message = message that be inputed by user
    }
 
    public MyException(Throwable cause) { //constructor of this class
        super(cause);  //use parent's constructor
    }
 
    public String toString() {// toString method
        return message; //return message
    }
}
