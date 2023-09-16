package com.Task_1;
import java.util.Random;
import java.util.Scanner;
public class T_04_NumberGuessingNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.print("Enter the lower limit of the number range: ");
	        int lowerLimit = scanner.nextInt();
	        System.out.print("Enter the upper limit of the number range: ");
	        int upperLimit = scanner.nextInt();

	        if (upperLimit <= lowerLimit) {
	            System.out.println("Invalid input. The upper limit must be greater than the lower limit.");
	            return;
	        }

	        int generatedNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
	        int attempts = 0;

	        while (true) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess < generatedNumber) {
	                System.out.println("Your guess is too low. Try again.");
	            } else if (userGuess > generatedNumber) {
	                System.out.println("Your guess is too high. Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number " + generatedNumber +
	                                   " correctly in " + attempts + " attempts.");
	                break;
	            }
	        }

	        scanner.close();
	    }
	}

