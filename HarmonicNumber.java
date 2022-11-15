package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

/*4. Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
   (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

public class HarmonicNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : "); //User Input
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print("The Harmonic Series is : ");
		double result = 0.0;
		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.print(result + "  ");
		}
		
		System.out.println("\nOutput of Harmonic Series is : " + result);
	}

}






/*{
	public static void main(String arg[])
	{
	double n=10,i;
	double sum=0;	
	for( i=1;i<=n;i++)
	{
		sum=sum+(1/i);
	}
	System.out.println("Harmonic value = "+sum);
	}
}*/