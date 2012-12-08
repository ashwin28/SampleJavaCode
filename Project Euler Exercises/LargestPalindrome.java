package projectEuler;

public class LargestPalindrome
{
	/*Find the largest palindrome made from the product of two 3-digit numbers.
	 *A palindromic number reads the same both ways. The largest palindrome
	 *made from the product of two 2-digit numbers is 9009 = 91 99.
	 */
	public static void main(String[] args)
	{
		int product = 0, number1 = 0, number2 = 0;
		
		//looping all possible combinations 3-digit numbers, lowest being 100
		for(int i = 999; i > 100; i--)
		{
			for(int j = 999; j >= i; j--)
			{
				//keeping track of the largest palindrome
				if(isPalindrome(i*j) && (product < (i * j)))
				{
					product = i * j;
					number1 = i;
					number2 = j;
					break;
				}				
			}
		}
		
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is");
		System.out.println(number1 + " x " + number2 + " = " + product);
	}
	
	//helper method to check if a number is a palindrome
	public static boolean isPalindrome(int value)
	{
		StringBuilder builder = new StringBuilder("" + value);
		
		String string1 = "" + value;
		//easiest way to reverse a string
		String string2 = builder.reverse().toString();
		
		if(string1.equals(string2))
			return true;
		else
			return false;
	}
}
