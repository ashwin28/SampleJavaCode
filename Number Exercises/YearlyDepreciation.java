package chapter2;

import java.util.Scanner;

public class YearlyDepreciation
{
	/*The straight-line method for computing the yearly depreciation in value D for an
	  item is given by the following formula:
	  D = (P – S) / Y
	  where P is the purchase price, S is the salvage value, and Y is the number of years
	  the item is used. Write a program that takes as input the purchase price of an item,
	  the expected number of years of service, and the expected salvage value. The program
	  should then output the yearly depreciation for the item.
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double purchasePrice, salvageValue, yearsOfService, depreciation;
		
		System.out.println("Please enter the item's purchase price:");
		purchasePrice = input.nextDouble();
		
		System.out.println("Please enter the item's years of service:");
		yearsOfService = input.nextDouble();
		
		System.out.println("Please enter the item's expected salvage value:");
		salvageValue = input.nextDouble();
		input.close();
		
		depreciation = (purchasePrice - salvageValue) / yearsOfService;
		System.out.printf("The yearly depreciation for the item is $%.2f.%n", depreciation);
	}

}
