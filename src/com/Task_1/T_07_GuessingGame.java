package com.Task_1;

import java.util.Scanner;

public class T_07_GuessingGame {

    public static void main(String[] args) {

        int hiddenNum = 10;

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a numebr by guessing: ");

            int guessedNum = input.nextInt();


            if (guessedNum == hiddenNum) {
                System.out.println("Congratulation! Your number is matched");

                System.exit(0);

            } else if (guessedNum < hiddenNum) {
                System.out.println("Not matched! Try a bigger number");


            } else if (guessedNum > hiddenNum) {
                System.out.println("Not matched! Try a smaller number");

            }    
        } 
    }    
}