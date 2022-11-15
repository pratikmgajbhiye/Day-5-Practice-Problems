package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class Find_Quotient_And_Remainder {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.err.println("Enter the Dividend : ");//User Input
			int dividend = sc.nextInt();
			
			System.err.println("Enter the Divisor : ");//User Input
			int divisor = sc.nextInt();

		    int quotient = dividend / divisor;
		    int remainder = dividend % divisor;

		    System.out.println("Quotient = " + quotient);
		    System.out.println("Remainder = " + remainder);
		}
	

}
