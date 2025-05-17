package parametersDemo_9;

public class PassParametersReturn
{

	public static void main(String[] args)
	{
		DynamicCalculator obj1= new DynamicCalculator();
		
		int sum=obj1.add(455,300);
		
		System.out.println("Sum Result is "+sum);
		
		double subt=obj1.sub(789.65, 56.55);
		
		System.out.println("Subtraction Result is "+subt);
		
		String Fname=DynamicCalculator.getMyFullName("Amol", "Deokar");
		
		System.out.println("Your Full Name is "+Fname);
		
	
	}
	
	

}
