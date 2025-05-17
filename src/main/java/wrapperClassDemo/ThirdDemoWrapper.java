package wrapperClassDemo;

public class ThirdDemoWrapper 
{

	public static void main(String[] args) 
	{
 
		String price1="463.90";
		
		String price2="237.65";
		
		Double p1=Double.parseDouble(price1);
		Double p2=Double.parseDouble(price2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		double sum=p1+p2;
		
		if(sum==700.00)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		

	}

}
