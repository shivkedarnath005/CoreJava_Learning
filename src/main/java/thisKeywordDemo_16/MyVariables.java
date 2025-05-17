package thisKeywordDemo_16;

public class MyVariables
{

	int x;
	int y; //Instance variable will have default value 0 assigned
	
	public static void main(String[] args)
	{
		MyVariables obj1=new MyVariables(10,50);
		obj1.sum();
		
		
	}
	public MyVariables(int x, int y)
	{
		this.x=x; //use this keyword to access the Instance variable and current class constructor
		this.x=y;
		
	}
	
	public void sum()
	{
		int sum=x+y;
		System.out.println(sum);
	}
	
	

}
