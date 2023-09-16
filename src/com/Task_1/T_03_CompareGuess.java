package com.Task_1;

import java.util.Random;
import java.util.Scanner;

public class T_03_CompareGuess {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt();
		int c = 5;
		System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

		for (int i = 1; i <= c; i++) {
			System.out.println("\n guess Your Choice  : ");
			int guess = sc.nextInt();
			if (guess > num) {
				System.out.println("Too high, try again");
			}

			// if guess is less than actual
			else if (guess < num) {
				System.out.println("Too low, try again");
			}

			// guess is equal to actual value
			else {

				System.out.println("Yes, you guessed the number.");
			}
		}
		System.exit(0);
	}
}
