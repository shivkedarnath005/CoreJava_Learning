package classObjectDemo;

public class FirstClassdemo 
{
	
	int x=90;
	int y=100;

	public static void main(String[] args)
	{
		
		System.out.println("Program Started");
		
		FirstClassdemo object1 = new FirstClassdemo();
		
		object1.sum();
		
		System.out.println("X Value is "+object1.x);
		
		System.out.println("Y Value is "+object1.y);
		
		FirstClassdemo object2 = new FirstClassdemo();
		
        object2.sum();
		
		System.out.println("X Value is "+object2.x);
		
		System.out.println("Y Value is "+object2.y);
		
		System.out.println("End Program");

	}
	
	public void sum()
	{
		
		int a=90;
		int b=100;
		int c=b+a;
		
		System.out.println("Sum Of Two Numbers "+c);
		
	}

}
