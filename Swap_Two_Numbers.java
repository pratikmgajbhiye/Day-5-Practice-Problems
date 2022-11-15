package com.BridgeLabz.Day5PracticeProblem;

public class Swap_Two_Numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int first = 5;
		 int second = 6;
		 int third = 7;

	     System.out.println("Before Swap");
	     System.out.println("First Number = " + first);
	     System.out.println("Second Number = " + second);
	        
	     int temporary = first;	//Value of first is assigned to temporary variable
	      
	     first = third; //Value of second is assigned to first number
	     
	     third = second;

	     second = temporary; // Value of temporary (which contains the initial value of first) is assigned to second number

	      
	        System.out.println("After Swap");
	        System.out.println("First Number = " + first);
	        System.out.println("Second number = " + second);
	        System.out.println("Third number = " + third);
	}

}
