/*
 * Copyright (c) Noel Girett
 * All Rights Reserved.
 */

import java.util.Scanner;

/**
 * @version 1.0 06/22/17
 * @author Noel Girett
 */
public class Rightpoint2 {

	/**
	 * Rightpoint
	 * Write a program in your language of choice that prints the numbers from 1 to 100.
	 * But for multiples of three print "right" instead of the number and for the multiples
	 * of five print "point". For numbers which are multiples of both three and five print
	 * "rightpoint".
	 */
	public static void main(String[] args) {
		// while loop

		// Declare Variables
		int count = 1;
		int a = 0;
		int b = 0;
		int c = 0;

		Scanner input = new Scanner(System.in);

		// Input
		System.out.println("The following is from a while loop:");

		// Processing
		while (count <= 100) {
			if (count % 15 == 0) {
				System.out.printf("%3d%s\n", count, " rightpoint");
				count++;
				a++;
			}
			else if (count % 5 == 0) {
				System.out.printf("%3d%s\n", count, " point");
				count++;
				b++;
			}
			else if (count % 3 == 0) {
				System.out.printf("%3d%s\n", count, " right");
				count++;
				c++;
			}
			else {
				System.out.printf("%3d\n", count);
				count++;
			}
		}

		// Output
		System.out.println("There are " + c + " rights.");
		System.out.println("There are " + b + " points.");
		System.out.println("There are " + a + " rightpoints.");


//-------------------------------------------------------------------
		// for loop

		// Declare Variables
		int count2;
		int d = 0;
		int e = 0;
		int f = 0;


		// Input
		System.out.println("\nThe following is from a for loop:");

		// Processing
		for (count2 = 1; count2 <= 100; count2++) {
			if (count2 % 15 == 0){
				System.out.printf("%3d%s\n", count2, " rightpoint");
				d++;
			}
			else if (count2 % 5 == 0) {
				System.out.printf("%3d%s\n", count2, " point");
				e++;
			}
			else if (count2 % 3 == 0) {
				System.out.printf("%3d%s\n", count2, " right");
				f++;
			}
			else {
				System.out.printf("%3d\n", count2);
			}
		}

		// Output
		System.out.println("There are " + f + " rights.");
		System.out.println("There are " + e + " points.");
		System.out.println("There are " + d + " rightpoints.");


//-------------------------------------------------------------------
		// do...while loop


		// Declare Variables
		int count3 = 1;
		int g = 0;
		int h = 0;
		int i = 0;


		// Input
		System.out.println("\nThe following is from a do...while loop:");

		// Processing
		do {
			if (count3 % 15 == 0) {
				System.out.printf("%3d%s\n", count3, " rightpoint");
				count3++;
				g++;
			}
			else if (count3 % 5 == 0) {
				System.out.printf("%3d%s\n", count3, " point");
				count3++;
				h++;
			}
			else if (count3 % 3 == 0) {
				System.out.printf("%3d%s\n", count3, " right");
				count3++;
				i++;
			}
			else {
				System.out.printf("%3d\n", count3);
				count3++;
			}

		} while (count3 <=100);

		// Output
		System.out.println("There are " + i + " rights.");
		System.out.println("There are " + h + " points.");
		System.out.println("There are " + g + " rightpoints.");
	}
}
