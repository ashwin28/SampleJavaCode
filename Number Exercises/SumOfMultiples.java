package chapter3;

public class SumOfMultiples
{
	/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
	  The sum of these multiples is 23. 
	  Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public static final int MAX_VALUE = 999;
	
	public static void main(String[] args)
	{
		//the formula for the sum of an arithmetic series is:
		//Sn = (n * (a1 + an))/2
		
		//this is an arithmetic series with a common difference of 3
		int multiplesOf3 = ((MAX_VALUE/3) * (3 + (MAX_VALUE / 3) * 3)) / 2;
		
		//this is an arithmetic series with a common difference of 5
		int multiplesOf5 = ((MAX_VALUE/5) * (5 + (MAX_VALUE / 5) * 5)) / 2;
		
		//this is an arithmetic series with a common difference of 15
		int multiplesOf15 = ((MAX_VALUE/15) * (15 + (MAX_VALUE / 15) * 15)) / 2;
		
		int answer = multiplesOf3 + multiplesOf5 - multiplesOf15;
		
		System.out.print("The sum of all the multiples of 3 or 5 below 1000 is ");
		System.out.println(answer + ".");
	}
}
