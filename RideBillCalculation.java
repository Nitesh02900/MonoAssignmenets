package com.techlabs.Assignments.app;

import java.util.Scanner;

public class RideBillCalculation {

	public static void main(String[] args) {
		int total_bill=0;
		System.out.println("Enter your Height:");
		Scanner scanner=new Scanner(System.in);
		int height=scanner.nextInt();
		if(height<120) {
			System.out.println("You can't ride:");
		}else {
			System.out.println("You can ride:");
			System.out.println("Enter your age:");
			int age=scanner.nextInt();
			if(age<12) {
				total_bill+=5;
			}else if(age>12&&age<18) {
				total_bill+=7;
			}else if(age>=18&&(age>45&&age<55)){
				total_bill+=0;
				
			}else
				total_bill+=12;

			System.out.println("Do you want photos?");
			String decision=scanner.next();
			if (decision.equalsIgnoreCase("yes")) {
	            System.out.println("You chose 'YES'. Proceeding...");
	            total_bill+=3;
	            System.out.println("Total bill is:"+total_bill);
		}else {
			 System.out.println("You chose 'NO'. Proceeding...");
			 System.out.println("Total bill is:"+total_bill);
		}
			
		}
   }
}
