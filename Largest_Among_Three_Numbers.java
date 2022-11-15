package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class Largest_Among_Three_Numbers {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Number :");//User Input 1
			int num1 = sc.nextInt();
			
			System.out.println("Enter the Second Number :");//User Input 2
			int num2 = sc.nextInt();
			
			System.out.println("Enter the Third Number :");//User Input 3
			int num3 = sc.nextInt();
			
			if((num1>num2) && (num1>num3)) {
				System.out.println("Largest Number is :"+num1);
			}
			
			else if(num2>num3) {
				System.out.println("Largest Number is :"+num2);
			}
			
			else {
				System.out.println("Largest Number is :"+num3);
			}
		}

}
