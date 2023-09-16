// Java program for the above approach
package com.Task_1;

import java.util.Random;
import java.util.Scanner;

public class T_02_GuessNumber {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt();
		int c = 5;
		System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

		for (int i = 1; i < c; i++) {
			System.out.println("\n guess Your Choice  : ");
			int guess = sc.nextInt();
			if (num == guess) {
				System.out.println("Congratulations!" + " You guessed the number.");
				break;
			} else if (num > guess && i != c - 1) {
				System.out.println("The number is " + "greater than " + guess);
			} else if (num < guess && i != c - 1) {
				System.out.println("The number is" + " less than " + guess);
			}

			if (i == c) {
				System.out.println("You have exhausted" + " c trials.");

				System.out.println("The number was " + num);
			}
		}
	}
}
