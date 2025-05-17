package conditionalStatement_6;

public class NestedIfElsedemo {

	public static void main(String[] args)
	{
		
		int per10th, per12th;
		
		per10th=67;
		per12th=88;
		
		if(per12th>=80)
		{
			if(per10th>=80)
			{
				
				System.out.println("You will get 50% discount");
				
			}
			else
			{
				System.out.println("You will get 25% discount");
			}
				
		}
		else
		{
			System.out.println("Sorry No Discount For You");
			
		}
		
		
	}

}
