package projectEuler;

public class DifferenceBetweenSums
{
	/*The sum of the squares of the first ten natural numbers is, 
	  1^2 + 2^2 + ... + 10^2 = 385
	  
	  The square of the sum of the first ten natural numbers is, 
	  (1 + 2 + ... + 10)^2 = 552 = 3025
	  
	  Hence the difference between the sum of the squares of the first ten natural
	  numbers and the square of the sum is 3025 - 385 = 2640. 
	  
	  Find the difference between the sum of the squares of the first one hundred
	  natural numbers and the square of the sum.

	 */
	
	public static void main(String[] args)
	{
		
		//sum of the squares of the first one hundred natural numbers
		//the sum of the first n squares is given by the relation: n*(n+1)*(2n+1)/6
		int sumOfSquares = (100 * (100 + 1) * (2 * (100) + 1) ) / 6;
				
		//square of the sum of the first one hundred natural numbers
		//the formula for the sum of an arithmetic series is:
		//Sn = (n * (a1 + an))/2
		
		int squareOfSums = (int) Math.pow(((100 * (1 + 100)) / 2), 2);
		
		System.out.print("The difference between the sum of the squares of the first one hundred ");
		System.out.print("natural numbers and the square of the sum is ");
		System.out.println(squareOfSums - sumOfSquares + ".");
	}
}
