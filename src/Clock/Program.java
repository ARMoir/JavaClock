package Clock;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Program 
{
	
	 public static class Clock
     {
         public static ArrayList<String> ClockChar = new ArrayList<String>();
         public static StringBuilder ClockString = new StringBuilder();
         public static StringBuilder Display = new StringBuilder();
         public static int Hours = 0;
         public static int Minutes = 0;
         public static int Minute = 0;
         public static int Seconds = 0;
     }

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		

		while(true) 
		{
			Clock.ClockChar.clear();
			Clock.ClockString.setLength(0);
			Clock.Display.setLength(0);
			Face.SetFace();
			
			char[] temp = (Clock.ClockString.toString()).toCharArray();
			
			for (int i = 0; i< temp.length; i++)
			{
				Clock.ClockChar.add(String.valueOf(temp[i])) ;
			}
			
			//Get the Current Time
			var Time = ZonedDateTime.now();
			Clock.Hours = Time.getHour();
			Clock.Minutes = Time.getMinute();
			Clock.Seconds = Time.getSecond();
			Clock.Minute = Clock.Minutes % 10;
            
			Hour.SetHour();
			Minute.SetMinute();
			Second.SetSecond();
			
			for (int i = 0; i< Clock.ClockChar.size(); i++)
			{
				Clock.Display.append(Clock.ClockChar.get(i));
			}
			
			System.out.println(Clock.Display.toString());	
			Thread.sleep(1000);
			Clear.Console(); 

		}
	}	
}
