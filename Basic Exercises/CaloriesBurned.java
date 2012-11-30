import java.text.DecimalFormat;

public class CaloriesBurned
{
	/*One way to measure the amount of energy that is expended during exercise is to
	  use metabolic equivalents (MET). Here are some METS for various activities:
	  Running 6 MPH: 10 METS
	  Basketball: 8 METS
	  Sleeping: 1 MET
	  
	  The number of calories burned per minute may be estimated using the following
	  formula:
	  Calories/Minute = 0.0175 * MET * Weight in kilograms
	  Write a program that calculates and outputs the total number of calories burned
	  for a 150-pound person who runs 6 MPH for 30 minutes, plays basketball for
	  30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
	 */
	
	public static final double POUNDS_TO_KILOGRAMS = 2.2;
	public static final int RUNNING_METS = 10;
	public static final int BASKETBALL_METS = 8;
	public static final int SLEEPING_METS= 1;
		
	public static void main(String[] args)
	{
		double weight = 150 / POUNDS_TO_KILOGRAMS;
		double running = 0.0175 * RUNNING_METS * weight * 30;
		double basketball = 0.0175 * BASKETBALL_METS * weight * 30;
		double sleeping = 0.0175 * SLEEPING_METS * weight * (6*60);
		
		double totalCaloriesBurned = running + basketball + sleeping;
		DecimalFormat myFormat = new DecimalFormat(".##"); //to show only 2 decimal places
		
		System.out.println("The total number of calories burned is " + myFormat.format(totalCaloriesBurned));
		
	}
}
