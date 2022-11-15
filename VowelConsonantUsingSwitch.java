package com.BridgeLabz.Day5PracticeProblem;

import java.util.Scanner;

public class VowelConsonantUsingSwitch {
	
	public static void main(String[ ] arg)
	   {
		boolean isVowel=false;;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Character : ");//User Input - Character
		char ch=scanner.next().charAt(0); 
		scanner.close();
		switch(ch)
		{
		   case 'a' :
		   case 'e' :
		   case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U' : isVowel = true;
		}
		if(isVowel == true) {
		   System.out.println(ch+" is  a Vowel");
		}
		else {
		   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println(ch+" is a Consonant");
		   else
			System.out.println("Entered value is not an alphabet");		
	        }
	   }

}
