
public class WordReplace
{
	/*Write a program that starts with a line of text and then outputs that line of text
	  with the first occurrence of "hate" changed to "love".
	  You can assume that the word "hate" occurs in the input. If the word "hate"
	  occurs more than once in the line, your program will replace only the first occurrence
	  of "hate".
	 */
	public static final String  OCCURRENCE = "hate";
	public static final String REPLACE_WITH = "love";
	
	public static void main(String[] args)
	{
		String text1 = "I hate rainy days.";
		String text2 = "I hate winter and hate black ice.";
				
		int position1 = text1.indexOf(OCCURRENCE);
		int position2 = text2.indexOf(OCCURRENCE);
		
		text1 = text1.substring(0, position1) + REPLACE_WITH + text1.substring(position1 + OCCURRENCE.length());
		text2 = text2.substring(0, position2) + REPLACE_WITH + text2.substring(position2 + OCCURRENCE.length());
		
		System.out.println("The changed strings are:");
		System.out.println(text1);
		System.out.println(text2);
	}
}
