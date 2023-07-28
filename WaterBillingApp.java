package com.techlabs.Assignments.app;

import java.util.Scanner;

public class WaterBillingApp {

	public static void main(String[] args) {
		System.out.println("*****************Water Billing app:******************");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of units consumed:");
		int Units_Consumed=scanner.nextInt();
		int meter_charge=75;
		int charge;
		int Total_water_bill=0;
		if(Units_Consumed<=100) {
			charge=Units_Consumed*5;
		}
		else if(Units_Consumed<=250){
			charge=Units_Consumed*10;
		}
		else {
			charge=Units_Consumed*20;
		}
		Total_water_bill=charge+meter_charge;
		System.out.println("Total Bill:"+Total_water_bill);	
   
	}
}
