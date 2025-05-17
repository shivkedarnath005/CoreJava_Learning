package classs.objects.methods_8;

public class MethodDemo 
{
	int a; //Instance variable
	
	public void hello() //simple method definition
	{
		System.out.println("Executing Hello Method ");
	}
	
	public void add(int a, int b) //parameterized method no return type
	{
		int c;//method variable
		c=a+b;
		System.out.println("Numbers Addition = "+c);
	}
	
    public int sub(int a, int b) //parameterized method with return type
    {
    	return a-b;
    }
    
}
