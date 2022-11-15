package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner; 

/* Que:
3. Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
   powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.
*/

public class PowerOfTwo {
	static int power(int base, int exponent)  
	{  
	int power = 1;//Increment the value of i after each iteration until the condition becomes false  
	for (int i = 1; i <= exponent; i++)//Calculates power  
	power = power * base;//Returns power  
	return power;  
	}//driver code  
	public static void main(String args[])  
	{  
	int base=2, exponent;  //Base is directly declared
	Scanner sc=new Scanner(System.in);  
	//System.out.print("Enter the base: ");  
	//base=sc.nextInt();  
	System.out.print("Enter the exponent : ");  
	exponent=sc.nextInt();//Calling function
	int pow=power(base, exponent);//Prints the result  
	//System.out.println(base +" to the power " +exponent + " is: "+pow);
	System.out.println("2^"+exponent + " is : "+pow);
	
	}  

}
