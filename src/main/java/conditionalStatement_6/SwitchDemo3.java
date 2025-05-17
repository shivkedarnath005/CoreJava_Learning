package conditionalStatement_6;

import java.util.Scanner;

public class SwitchDemo3 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("Welcome to Idea Services");
		System.out.println("Please enter no between a to c");
		a=sc.next();
		
		switch(a)
		{
		  case "abc":
			  System.out.println("This is for Recharge & Balance Enquiry");
		      break;
		  case "kbc":
			  System.out.println("This is for internet services");
	          break;
	      case "bbc":
	    	  System.out.println("This is for New Plans & Services");
	          break;
	      default:
	    	  System.out.println("Sorry for Inconvenience");
		      break;
		      
		}
		
		

	}

}



