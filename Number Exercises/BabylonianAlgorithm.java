package chapter2;

import java.util.Scanner;

public class BabylonianAlgorithm
{	
	/*The Babylonian algorithm to compute the square root of a positive number n is as
	  follows:
	  1. Make a guess at the answer (you can pick n /2 as your initial guess).
	  2. Compute r = n / guess
	  3. Set guess = (guess +r)/ 2
	  4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
	  	 2 and 3, the closer guess will become to the square root of n .
	  Write a program that inputs a double for n , iterates through the Babylonian algorithm
	  ten times, and outputs the answer as a double to two decimal places. Your
	  answer will be most accurate for small values of n.
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Double n, r, guess;
		
		System.out.println("Please enter a positive number to compute it's square root.");
		n = input.nextDouble();
		
		//initial guess n/2
		guess = n / 2;
		
		for(int i = 0; i < 10; i++)
		{
			r = n / guess;
			guess = (guess + r) / 2;
		}
		
		System.out.print("The guess for the the square root of " + n);
		System.out.printf(" is %.2f.%n", n, guess);
		
		input.close();
	}
}
