package conditionalStatement_6;

import java.util.Scanner;

public class switchDemo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter the user input for performance");
		x=sc.nextInt();
		
		switch(x)
		{
		
		case 1:
		
		System.out.println("Performance is Poor");
		
		break;
		
        case 2:
		
		System.out.println("Slow Performer");
		
		break;
		
        case 3:

        System.out.println("Meeting Expectations");

        break;

        case 4:

        System.out.println("Well Done Keep Rocking");

        break;
        
        case 5:

        System.out.println("Employee of the Year");

        break;
        
        default:
        	
        System.out.println("You are Fired");
        break;
		
		}

	}

}
