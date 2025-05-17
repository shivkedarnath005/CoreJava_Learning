package stringDemo_2;

public class StringDemo1 
{

	public static void main(String[] args) 
	{
		
		
		String actual = "Welcome to Selenium Webdriver World";
		
		String expected = "Selenium";
		
		boolean status=actual.startsWith("Welcome");
		
		System.out.println("Status is "+status);
		
		boolean status2=actual.contains(expected);
		
		System.out.println("Status is "+status2);
		
	}

}
