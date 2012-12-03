package chapter2;

import java.util.Scanner;

public class ListOfPrimes
{
	/*A prime number is a natural number greater than 1 that has no positive divisors
	  other than 1 and itself. Write a program that takes an integer as an input,
	  and returns all prime numbers that occur before it. 
	  For example, 25 outputs {2, 3, 5, 7, 11, 13, 17, 19, 23}.
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a natural number greater than 1.");
		int userInput = input.nextInt();
		
		System.out.println("The list of prime numbers that occur before " + userInput + " is:");
		System.out.println(listPrimes(userInput));
		input.close();		
	}
	
	public static String listPrimes(int n)
	{
		//generating result string
		String result = "{";
		for(int i = 2; i < n ; i++)
		{
			//helper method to check if an integer is a prime
			if(isPrime(i))
			{
				//adding the comma separators to all but the first result
				result += (result.length() == 1) ? "" : ",";
				
				result += i;				
			}			
		}		
		return result += "}";
	}
	
	//helper method to check if an integer is a prime
	public static boolean isPrime(int n) 
	{
		//reason for looping till sqrt(n), n is at most sqrt(n)*sqrt(n)
		for (int i = 2; i < ((int) Math.sqrt(n)) + 1; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
