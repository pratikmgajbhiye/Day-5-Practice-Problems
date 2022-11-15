package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");//User Input
		int size = sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Enter row for the  array : ");
		int row = sc.nextInt();
		System.out.println("Enter column for the  array : ");
		int col = sc.nextInt();
		
		System.out.println("Enter "+ (row *col) +" Array Elements: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
		System.out.println("The Array Element:\n");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}

}
