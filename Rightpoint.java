/*
 * Copyright (c) Noel Girett
 * All Rights Reserved.
 */

import java.util.Scanner;

/**
 * @version 1.0 06/22/17
 * @author Noel Girett
 */
public class Rightpoint {

	/**
	 * Rightpoint
	 * Write a program in your language of choice that prints the numbers from 1 to 100.
	 * But for multiples of three print "right" instead of the number and for the multiples
	 * of five print "point". For numbers which are multiples of both three and five print
	 * "rightpoint".
	 */
	public static void main(String[] args) {
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
  }
}
