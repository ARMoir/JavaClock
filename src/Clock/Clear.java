package Clock;

public class Clear 
{
	public final static void Console()  
	{  
		try  
		{  
			final String os = System.getProperty("os.name");  
			if (os.contains("Windows"))  
			{  
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();    
			}  
			else  
			{  
				Runtime.getRuntime().exec("clear");  
				System.out.print("\033[H\033[2J");  
			    System.out.flush(); 
			}  
		}  
		catch (final Exception e)  
		{  
			e.printStackTrace();  
		}  
	}  
}
