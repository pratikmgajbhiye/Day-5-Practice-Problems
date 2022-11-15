package com.BridgeLabz.Day5PracticeProblem;

public class SumofThreeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, -1, -7, -4, -5, 9, -4};
		
		
		for(int i=0;i<arr.length;i++) {
			
			int firstNumber=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
			    	
			    	int secondNumber = arr[j];
			
			    	for(int k=j+1;k<arr.length;k++) {
					
					int thridNumber = arr[k];
					int sum = firstNumber + secondNumber + thridNumber;	
					
					if(sum==0) {
						System.out.print(firstNumber+" + "+secondNumber+" + "+thridNumber+ " = "+0);
					}
				}
				System.out.println();
		}
			
	

}

	}

}
