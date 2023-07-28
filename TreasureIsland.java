package com.techlabs.Assignments.app;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island. \r\n" + 
				"Your mission is to find the treasure.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side left or right as L and R:");
         char side = scanner.next().charAt(0);
                          
        if((side=='R'||side=='r')&&(side!='L'||side!='l'))
        	System.out.println("Fall into a hole.\r\n" + 
        			"Game Over");
        else {
        	Scanner scanner1 = new Scanner(System.in);
    		System.out.println("You have entered left:");
    		System.out.println("Choose Swim or Wait:");
            char side1 = scanner1.next().charAt(0);
            if((side1=='S'||side1=='s')&&(side1!='W'||side1!='w'))
        	System.out.println("Attacked by trout.\r\n" + 
        			"Game Over");
            else {
            	Scanner scanner2 = new Scanner(System.in);
            	System.out.println("Which door? Red,Blue or Yellow choose anyone:?");
            	char color = scanner2.next().charAt(0);
            	if(color=='R'||color=='r')
            		System.out.println("Burned by fire game over");
            	else if(color=='B'||color=='b')
            		System.out.println("Eaten by beasts game over");
            	else if(color=='Y'||color=='y')
            		System.out.println("You Win");
            	else
            		System.out.println("Game Over");
       
            }
        }
	
	}

}
