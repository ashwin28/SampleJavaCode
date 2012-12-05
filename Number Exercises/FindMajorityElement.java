
public class FindMajorityElement
{
	/*The majority element of an array is the element that occurs more than n/2 times in that array.
	  Write a method that takes an array as an input and outputs the majority element if it exists
	  or -1 if there is none.
	  Example:
	  Input : 3 3 4 2 4 4 2 4 4 
	  Output : 4 
	
	  Input : 3 3 4 2 4 4 2 4 
	  Output : -1
	 */
	public static void main(String[] args)
	{
		int[] sampleArray1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int[] sampleArray2 = {3, 3, 4, 2, 4, 4, 2, 4};
		
		System.out.println(findMajorityElemen(sampleArray1));
		System.out.println(findMajorityElemen(sampleArray2));
	}
	
	public static int findMajorityElemen(int[] array)
	{
		int count = 0, majorityElementcandidate = 0;
		
		for(int x : array)
		{
			if(count == 0)
				majorityElementcandidate = x;
			
			//If there is a majority element, worst case n/2 elements will result in count--
			//and the remaining element will be the best candidate
			if(majorityElementcandidate == x)
				count++;
			else
				count--;
		}
		
		//reset count
		count = 0;
		
		//checking if majority element candidate occurs more then n/2 times
		for(int x : array)
			if(majorityElementcandidate == x)
				count++;
		
		if(count > (array.length / 2))
			return majorityElementcandidate;
		else
			return -1;
	}
}
