package com.techlabs.Assignments.app;

import java.util.Random;
import java.util.Scanner;

public class WordGuessureApp {

	public static void main(String[] args) {
		// Generate a random word less than 10 characters
    	System.out.println("*******************Word Guessure Game**********************");
        String randomWord = generateRandomWord();

        // Generate the modified word with random characters as hints
        String modifiedWord = generateModifiedWord(randomWord);

        System.out.println("Random Word: " + randomWord);
        System.out.println("Modified Word: " + modifiedWord);

        Scanner scanner = new Scanner(System.in);
        while (!modifiedWord.equals(randomWord)) {
            System.out.print("Guess a character: ");
            char inputChar = scanner.nextLine().charAt(0);
            modifiedWord = updateWord(modifiedWord, randomWord, inputChar);
            System.out.println("Modified Word: " + modifiedWord);
        }

        System.out.println("Congratulations! You guessed the word: " + randomWord);
    }

    public static String generateRandomWord() {
        String[] words = { "apple", "banana", "orange", "grape", "pear", "peach" };
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    public static String generateModifiedWord(String randomWord) {
        StringBuilder modifiedWord = new StringBuilder(randomWord.length());
        Random random = new Random();

        for (int i = 0; i < randomWord.length(); i++) {
            if (random.nextDouble() < 0.3) {
                modifiedWord.append(randomWord.charAt(i));
            } else {
                modifiedWord.append('-');
            }
        }
        return modifiedWord.toString();
    }

    public static String updateWord(String modifiedWord, String randomWord, char inputChar) {
        StringBuilder sb = new StringBuilder(modifiedWord);

        for (int i = 0; i < randomWord.length(); i++) {
            if (Character.toLowerCase(randomWord.charAt(i)) == inputChar) {
                sb.setCharAt(i, inputChar);
            }
        }

        return sb.toString();

	}

}
