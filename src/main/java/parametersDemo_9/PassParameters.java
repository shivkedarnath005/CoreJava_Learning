package parametersDemo_9;

public class PassParameters

{

	public static void main(String[] args)
	{
		PassParameters obj1= new PassParameters();
		
		int sum = obj1.add(455,300);
		
		System.out.println("Sum Reuslt is "+sum);
		
		double subtract = obj1.sub(789.65, 56.55);
		
		System.out.println("Subtract Reuslt is "+subtract);
		
		String finalname = obj1.getMyFullName("Amol"," Deokar");
		
		System.out.println("Congrats "+finalname);
		
		
	}
	
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	
	
	public double sub (double x, double y)
	{
		double result =x-y;
		return result;
		
	}
	
	public static String getMyFullName (String firstname, String lastname)
	{
		String fullname=firstname+lastname;
		
		return fullname;
		
	}

}
