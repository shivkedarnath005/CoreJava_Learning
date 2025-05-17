package interfaceDemo_10;

import java.util.Scanner;

public class BookMyBusMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("BookMyBus Travel Services as follow ");
		System.out.println("Enter the Bus Servie Required for you  ");
		String x;
		x=sc.nextLine();
		BookMyBus obj1=new RedBus();
		BookMyBus obj2=new PurpleBus();
		BookMyBus obj3=new NeetaBus();
		
		
		switch(x)
		{
		  case "red":
		        obj1.busInformation();
		        obj1.ticketBooking();
		        obj1.ticketCancellation();
			    break;
		  
		  case "purple":
			    obj2.busInformation();
		        obj2.ticketBooking();
		        obj2.ticketCancellation();
			    break;
		  
	      case "neeta":
	    	    obj3.busInformation();
		        obj3.ticketBooking();
		        obj3.ticketCancellation();
			    break;
	      default:
	    	  System.out.println("Sorry for the Inconvenience");
		      break;
		      
		}
		

	}

}
