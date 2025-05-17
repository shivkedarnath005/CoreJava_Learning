package conditionalStatement_6;

public class ifElseifDemo 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Test Started ");
		
		String browser="Opera";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			
			System.out.println("TC Executed on Chrome ");
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			
			System.out.println("TC Executed on Firefox ");
			
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			
			System.out.println("TC Executed on IE ");
			
		}
		else 
		{
		
			System.out.println("Kindly Provide Valid Browser Name ");	
		
		}
		
		System.out.println("Test End ");

	}

}
