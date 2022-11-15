package com.BridgeLabz.Day5PracticeProblem;

public class FlipCoin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head = 0;
		int tail = 0;
		int noOfFlip = 4;
		for (int i = 0; i < noOfFlip; i++) {
			int random = (int) (Math.random() * 2);
			System.out.println(random);
			if (random == 1) {
				System.out.println("It is Head");
				head++;
			} else {
				System.out.println("It is Tail");
				tail++;
			}
		}

		System.out.println("Total Chance  :" + noOfFlip);
		System.out.println("Total Head  :" + head);
		System.out.println("Total Tail  :" + tail);

		int PerOfHead = (int) ((head * 100 / noOfFlip));
		System.out.println("Percentage of Head :" + PerOfHead + " % ");

		int PerOfTail = (int) ((tail * 100 / noOfFlip));
		System.out.println("Percentage of Tail :" + PerOfTail + " % ");
	}

}
