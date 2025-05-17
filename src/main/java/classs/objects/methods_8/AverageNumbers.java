package classs.objects.methods_8;

import java.util.Scanner;

public class AverageNumbers
{

	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		System.out.println("Input the First Number");
		double x=obj1.nextDouble();
		System.out.println("Input the Second Number");
		double y=obj1.nextDouble();
		System.out.println("Input the Third Number");
		double z=obj1.nextDouble();
		System.out.println("Average of three Numbers is= "+average(x,y,z)+"\n");
		
	}
	
	public static double average(double x, double y, double z)
	{
		double avg;
		avg=(x+y+z)/3;
		return avg;
	}

}
