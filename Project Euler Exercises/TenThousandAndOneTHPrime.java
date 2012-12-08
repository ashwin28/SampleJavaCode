package projectEuler;

public class TenThousandAndOneTHPrime
{
	/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. 
	  What is the 10 001st prime number?
	 */
	public static final int MAX = 10001;
	public static void main(String[] args)
	{
		int count = 0;
		long number = 2;
		
		while(true)
		{
			if(isPrime(number))
				count++;
			
			if(count == MAX)
				break;
			else			
				number++;
		}
		
		System.out.println("The 10 001 st prime number is " + number + ".");
	}
	
	//helper method to check if an integer is a prime
	public static boolean isPrime(long n) 
	{
		//reason for looping till sqrt(n), n is at most sqrt(n)*sqrt(n)
		for (long i = 2; i < ((long) Math.sqrt(n)) + 1; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
