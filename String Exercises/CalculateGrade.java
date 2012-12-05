import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculateGrade
{
	/*Write a program that calculates the total grade for three classroom exercises as a
	  percentage. Use the DecimalFormat class to output the value as a percent. The
	  scores should be summarized in a table. Input the assignment information in this
	  order: name of assignment (may include spaces), points earned (integer), and total
	  points possible (integer). The percentage is the sum of the total points earned divided
	  by the total points possible. Sample input and output is shown as follows:
	
	  Exercise 		Score   Total Possible
	  Group Project 10 		10
	  Homework 		7 		12
	  Presentation 	5 		8
	  Total 		22 		30
	  
	  Your total is 22 out of 30, or 73.33%.
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] nameOfAssignment = new String[3];
		int[] pointsEarned = new int[3];
		int[] pointsPossible = new int[3];		
		int totalPointsEarned = 0, totalPointsPossible = 0;
		
		//getting all the needed inputs
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Name of exercise " + (i + 1) + ":");
			nameOfAssignment[i] = input.nextLine();
			
			System.out.println("Score received for exercise " + (i + 1) + ":");
			pointsEarned[i] = input.nextInt();
			totalPointsEarned += pointsEarned[i];
			
			System.out.println("Total points possible for exercise " + (i + 1) + ":");
			pointsPossible[i] = input.nextInt();
			totalPointsPossible += pointsPossible[i];
			
			input.nextLine();			
		}
		
		input.close();
		DecimalFormat myFormat = new DecimalFormat("#.00%");
		
		//formatting output		
		System.out.printf("%n%-20s %-10s %-10s%n", "Exercise", "Score", "Total Possible");
		System.out.printf("%-20s %-10d %-10d%n", nameOfAssignment[0], pointsEarned[0], pointsPossible[0]);
		System.out.printf("%-20s %-10d %-10d%n", nameOfAssignment[1], pointsEarned[1], pointsPossible[1]);
		System.out.printf("%-20s %-10d %-10d%n", nameOfAssignment[2], pointsEarned[2], pointsPossible[2]);
		System.out.printf("%-20s %-10d %-10d%n", "Total", totalPointsEarned, totalPointsPossible);
		
		System.out.print("\nYour total is " + totalPointsEarned + " out of " + totalPointsPossible);
		System.out.println(", or " + myFormat.format((double)totalPointsEarned / totalPointsPossible) + ".");

	}
}
