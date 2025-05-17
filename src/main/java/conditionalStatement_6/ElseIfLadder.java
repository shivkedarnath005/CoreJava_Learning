package conditionalStatement_6;

public class ElseIfLadder 
{

	public static void main(String[] args)
	{
		
		int engfirsty=60, engsecondy=85, engthirdy=67, engfourthy=55;
		
		//all are independent conditions not depend on previous condition
		if(engfirsty>=80)
		{
			System.out.println("You will get a Bike in First Year");
		}
		else if(engsecondy>=80)
		      {
			   System.out.println("You will get Bike in Second Year");
		      }
		      else if (engthirdy>=80)
		            {
			
			        System.out.println("You will get Bike in Third Year");
		            }
		           else if (engfourthy>=80)
		                 {
			              System.out.println("You will get Bike in Fourth Year");
			
		                 }
		                else
		                {
			             System.out.println("Sorry You will not get Bike");
		                }

	}

}
