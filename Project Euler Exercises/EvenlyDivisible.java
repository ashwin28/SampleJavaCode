package projectEuler;

import java.util.ArrayList;

public class EvenlyDivisible
{
	/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. 
	  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static final int INCREMENT = 2520;
	public static void main(String[] args)
	{
		/*Since 2520 is the smallest number that can be divided
		 *by each of the numbers from 1 to 10 without any remainder,
		 *only have to check from 11 to 20 for multiples of 2520
		 */
		long startTime = System.currentTimeMillis();
		
		int smallestNumber = 0;
		boolean loopCheck = true;
		ArrayList<Integer> checkList = new ArrayList<Integer>();
		
		//add all integers between 11 - 20 that do not evenly divide 2520
		for(int i = 11; i < 21; i++)
			if(INCREMENT % i != 0)
				checkList.add(i);
		
		//this loop checks for the smallest number that is evenly divisible by 1 - 20
		while(loopCheck)
		{
			smallestNumber += INCREMENT;
			
			for(Integer x : checkList)
			{
				if(smallestNumber % x != 0)
					break;
				
				if(x == checkList.get(checkList.size() - 1))
					loopCheck = false;
			}			
		}
		
		System.out.print("The smallest positive number that is evenly divisible by all");
		System.out.println(" of the numbers from 1 to 20 is " + smallestNumber + ".");
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds.");
	}

}
