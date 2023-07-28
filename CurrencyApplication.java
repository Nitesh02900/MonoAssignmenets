package com.techlabs.Assignments.app;

import java.util.Scanner;

public class CurrencyApplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount (less than 50000):");
		int amount=scanner.nextInt();
		if(amount>50000){
			System.out.println("Invalid Amount!!it should not be greater than 50000:");
			return;
		}
		else if(amount%100==0) {
			    CountCurrency(amount);
		}
	}
	public static void CountCurrency(int amount){
		int twothousend = amount / 2000;
	    amount %= 2000;

	    int fivehundred = amount / 500;
	    amount %= 500;

	    int twohundred = amount / 200;
	    amount %= 200;

	    int onehundred = amount / 100;

	    System.out.println("Total Count of Currency:");
	    System.out.println("Count of 2000: " + twothousend);
	    System.out.println("Count of 500: " + fivehundred);
	    System.out.println("Count of 200: " + twohundred);
	    System.out.println("Count of 100: " + onehundred);
	}

}
