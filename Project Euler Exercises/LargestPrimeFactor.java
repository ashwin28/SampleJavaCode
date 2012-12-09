package projectEuler;

public class LargestPrimeFactor
{
	/*The prime factors of 13195 are 5, 7, 13 and 29. 
	  What is the largest prime factor of the number 600851475143 ?
	*/
	public static final long VALUE = 600851475143L;
	
	public static void main(String[] args)
	{
		long currentPrimeFactor = 2;
		long compositeNumber = VALUE;
		long i = 3;
		
		//2 is the only even prime, so this is the check before looping
		if(compositeNumber % 2 == 0)
			compositeNumber /= currentPrimeFactor;
		
		//checking all odd numbers
		while(compositeNumber != 1)
		{
			//only looking for the prime factors
			if(compositeNumber % i == 0)
			{
				currentPrimeFactor = i;
				compositeNumber /= i;
			}
			
			i += 2;
		}
		
		System.out.println("The largest prime factor of 600851475143 is " + currentPrimeFactor + ".");
	}	
}
