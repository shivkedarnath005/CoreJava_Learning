package stringDemo_2;

public class StringContains {

	public static void main(String[] args) 
	{
		
		String name ="Selenium Webdriver";
		
		boolean status=name.startsWith("Selenium");
		
		System.out.println("Status is "+status);
		
		String name1= "Welcome to Selenium Webdriver World";
		
		boolean status2=name1.endsWith("World");
		
		System.out.println("The New Status is "+status2);
		
	}

}
