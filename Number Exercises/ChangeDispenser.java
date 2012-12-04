package chapter2;

import java.util.Scanner;

public class ChangeDispenser
{
	/*Write a program that determines the change to be dispensed from a vending
	  machine. An item in the machine can cost between 25 cents and 1 dollar,
	  and the machine accepts only a single dollar bill to pay for the item.
	  For example:
	  Enter price of item (between $0.25 cents and $1.00):
	  0.45	
	  You bought an item for $0.45 and your change is
	  2 quarters, 0 dimes, 1 nickels and 0 pennies.
	 */
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKEL = 5;
	public static final int MAX_PRICE = 100;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double userInput;
		int change, quarters, dimes, nickels, pennies; 
		
		System.out.println("Enter price of item (between $0.25 cents and $1.00):");
		userInput = input.nextDouble();
		input.close();
		
		//converting to integers for easier calculation
		change = MAX_PRICE - (int) (userInput * 100);
				
		quarters = (change - (change % QUARTER)) / QUARTER;
		change = change - (quarters * QUARTER);
						
		dimes = (change - (change % DIME)) / DIME;
		change = change - (dimes * DIME);		
				
		nickels = (change - (change % NICKEL)) / NICKEL;		
		pennies = change - (nickels * NICKEL);
				
		System.out.print("You bought an item for $" + userInput + " and your change is ");
		System.out.print(quarters + " quarters, " + dimes + " dimes, ");
		System.out.println(nickels + " nickels and " + pennies + " pennies.");
	}
}
