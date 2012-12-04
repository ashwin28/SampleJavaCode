import java.util.Scanner;

public class ThreeItemBill
{
	/*Write a program that inputs the name, quantity, and price of three items. The
	  name may contain spaces. Output a bill with a tax rate of 6.25%. All prices should
	  be output to two decimal places. The bill should be formatted in columns with
	  30 characters for the name, 10 characters for the quantity, 10 characters for the
	  price, and 10 characters for the total. Sample input and output is shown as follows:
	  Your bill:
	  Item 				Quantity Price  Total
	  lollipops 		10 	 	 0.50 	5.00
	  diet soda 		3 	 	 1.25 	3.75
	  chocolate bar 	20 	 	 0.75 	15.00
	  
	  Subtotal 							23.75
	  6.25% sales tax 					1.48
	  Total 							25.23
	 */
	public static final double TAX = 0.0625;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] itemName = new String[3];
		int[] quantity = new int[3];
		double[] price = new double[3];
		double[] itemTotal = new double[3];
		double subTotal = 0, salesTax, total;
		
		//getting all the needed inputs
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Input name of item " + (i + 1) + ":");
			itemName[i] = input.nextLine();
			
			System.out.println("Input quantity of item " + (i + 1) + ":");
			quantity[i] = input.nextInt();
			
			System.out.println("Input price of item " + (i + 1) + ":");
			price[i] = input.nextDouble();
			
			input.nextLine();
			itemTotal[i] = quantity[i] * price[i];
		}
		
		input.close();
		//adding the total cost of each item
		for(double x : itemTotal)
			subTotal += x;
		
		//calculating tax and total
		salesTax = subTotal * TAX;
		total = subTotal + salesTax;
		
		//formatting output
		System.out.println("Your bill:");
		System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemName[0], quantity[0], price[0], itemTotal[0]);
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", itemName[1], quantity[1], price[1], itemTotal[1]);
		System.out.printf("%-30s %-10d %-10.2f %-10.2f%n%n", itemName[2], quantity[2], price[2], itemTotal[2]);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Subtotal", "", "", subTotal);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "6.25% sales tax", "", "", salesTax);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Total", "", "", total);		
	}

}
