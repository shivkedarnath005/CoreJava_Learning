package stringDemo_2;

public class StringSplit
{

	public static void main(String[] args) 
	{
		
		String fullname ="Selenium-HP-QTP-Grid";
		
		String[] toolname=fullname.split("-");
		
		for(int i=0;i<toolname.length;i++)
		{
			
			System.out.println("Value for "+i+ " is "+toolname[i]);
			
			if(toolname[i].equalsIgnoreCase("Selenium"))
			{
				System.out.println("Test Passed");
				break;
				
			}
			
		}
		
	}

}
