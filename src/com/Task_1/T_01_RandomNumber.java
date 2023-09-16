package com.Task_1;

import java.util.Random;

public class T_01_RandomNumber {
	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(100);
		System.out.println("Random Number Between 0 to 100 : " + num);
	}

}
