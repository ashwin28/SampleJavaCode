
public class SecondsConverter
{
	/*
	 * Write a program that outputs the number of hours, minutes, and seconds that
	   corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
	   and 51 seconds. 
	 */
	public static final int SECONDS_IN_MINUTES = 60;
	public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTES;
	
	public static void main(String[] args)
	{
		int time1 = 50391;
		int time2 = 86400;
		
		int hours1 = time1 / SECONDS_IN_HOUR;
		int minutes1 = (time1 - (hours1 * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTES;
		int seconds1 = time1 - (hours1 * SECONDS_IN_HOUR) - (minutes1 * SECONDS_IN_MINUTES);
		
		int hours2 = time2 / SECONDS_IN_HOUR;
		int minutes2 = (time2 - (hours2 * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTES;
		int seconds2 = time2 - (hours2 * SECONDS_IN_HOUR) - (minutes2 * SECONDS_IN_MINUTES);		
		
		System.out.printf("%d seconds => %d hours, %d minutes, %d seconds.\n", time1, hours1, minutes1, seconds1);
		System.out.printf("%d seconds => %d hours, %d minutes, %d seconds.\n", time2, hours2, minutes2, seconds2);
		
	}

}
