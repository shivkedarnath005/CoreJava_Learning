package classs.objects.methods_8;
import java.util.Scanner;

public class MinNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the First Number");
		double x=sc.nextDouble();
		
		System.out.println("Input the Second Number");
		double y=sc.nextDouble();
		
		System.out.println("Input the Third Number");
		double z=sc.nextDouble();
		
		MinNumber obj1=new MinNumber();
		obj1.smallest(x,y,z);
		
	}
	
	public void smallest(double x, double y, double z)
	{
		if(x<y && x<z)
		{
			System.out.println("x is smallest");
		}
		else if(y<z)
		    {
			  System.out.println("y is smallest");
		    }
		    else
		    { 
		     System.out.println("z is smallest");
		    }
	}

}
