package com.techlabs.Assignments.app;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {

	public static void main(String[] args) {
		NumberGuesser();
	}
	 public static void NumberGuesser() {
	        Random random = new Random();
	        int random_number = random.nextInt(100) + 1;
	        System.out.println("Random number between 1 to 100 is:"+random_number);
	        int tries=0;
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.print("Please guess a number between 1 and 100: ");
	            int number = scanner.nextInt();
	            tries++;
	            if (number < random_number) {
	                System.out.println("Sorry, Too Low");
	            } 
	            else if (number > random_number) {
	                System.out.println("Sorry, Too High");
	            } 
	            else {
	            	System.out.println("Congratulations ! You Won the game in: "+tries+" "+"tries");
	                break;
	            }
	        }
	        
	        System.out.print("Do you want to play again? (yes/no): ");
	        String playAgain = scanner.next();
	        
	        if (playAgain.equalsIgnoreCase("yes")) {
	            NumberGuesser();
	        } 
	        else {
	            System.out.println("Thank you for playing!");
	        }
	    }
	}

