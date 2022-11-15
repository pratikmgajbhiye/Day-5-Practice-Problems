package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");//User Input
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is Even Number ");
		} else {
			System.out.println(num + " is Odd Number ");
		}

	}

}
