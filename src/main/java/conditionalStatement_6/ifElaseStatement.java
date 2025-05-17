package conditionalStatement_6;

import java.util.Scanner;

public class ifElaseStatement 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Test Start");
		String browser;
		System.out.println("Enter the Browser - ");
		Scanner sc=new Scanner(System.in);
		browser=sc.next();
		
		if(browser.equalsIgnoreCase("Edge"))
		{
			System.out.println("TC Executed on IE Edge Browser");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		     {
			      System.out.println("TC Executed on Firexfox Browser");
		     }
		     else if(browser.equalsIgnoreCase("Chrome"))
		          {
		    	       System.out.println("TC Executed on Chrome Browser");
		          }
		
		System.out.println("Test End ");
		
	}

}
