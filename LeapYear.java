package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year to Check: ");//User Input - Year
		int year = sc.nextInt();
		
		if (year % 400==0)
		{
			System.out.println(year +" is a leap year");
		}
		else if (year % 100==0)
		{
			System.out.println(year +" is a not leap year");
		}
		else if (year % 4==0)
		{
			System.out.println(year +" is a leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
		}
	}

}
