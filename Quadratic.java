package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a =sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c : ");
		double c = sc.nextDouble();
		
		double delta = b*b - 4*a*c;
		if(delta > 0.0) 
		{
			double r1 = (-b + Math.pow(delta, 0.5)) /(2.0 * a);
			double r2 = (-b - Math.pow(delta, 0.5)) /(2.0 * a);
			System.out.println("The Roots are : "+ r1 + "and" + r2 );
		}
		else if(delta==0) 
		{
			double r1 = -b / (2 * a );
			System.out.println("The Root is :"+r1);
		}
		else 
		{
			System.out.println("Roots are not real");
		}
	}

}