package constructorDemo_15;

public class Marks 
{

	int result; //global variable default value is 0
	
	public static void main(String[] args)
	{
	   Marks m=new Marks(60);
	   m.displayResult();

	}
	public Marks(int marks)
	{
	  result=marks;	
	}
	
	
	public void displayResult()
	{
		System.out.println("Final Marks for Student is "+ result);
	}

}
