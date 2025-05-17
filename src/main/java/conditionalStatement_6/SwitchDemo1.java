package conditionalStatement_6;
import java.util.Scanner;


public class SwitchDemo1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Welcome to Idea Services");
		System.out.println("Please enter no between 1 to 3");
		a=sc.nextInt();
		
		switch(a)
		{
		  case 1:
			  System.out.println("This is for Recharge & Balance Enquiry");
		      break;
		  case 2:
			  System.out.println("This is for internet services");
	          break;
	      case 3:
	    	  System.out.println("This is for New Plans & Services");
	          break;
	      default:
	    	  System.out.println("Sorry for Inconvenience");
		      break;
		      
		}
		
		

	}

}
