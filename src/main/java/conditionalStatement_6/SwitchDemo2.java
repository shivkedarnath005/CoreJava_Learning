package conditionalStatement_6;
import java.util.Scanner;


public class SwitchDemo2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a;
		System.out.println("Welcome to Idea Services");
		System.out.println("Please enter no between a to c");
		a=sc.next().charAt(0);
		
		switch(a)
		{
		  case 'a':
			  System.out.println("This is for Recharge & Balance Enquiry");
		      break;
		  case 'b':
			  System.out.println("This is for internet services");
	          break;
	      case 'c':
	    	  System.out.println("This is for New Plans & Services");
	          break;
	      default:
	    	  System.out.println("Sorry for Inconvenience");
		      break;      
		}
	}

}
