package areaFormula;
import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args)
	{
		
		int a;//variable declaration
		
		Scanner sc=new Scanner(System.in);
		//sc is the obejct of scanner class
		//new keyword use to allocate the memory of a class
		//System.in for accepting the data from keyword
		
		System.out.println("Enter a value for a");
		a=sc.nextInt();
		//object calling the method
	
		System.out.println(" Square of Number a = "+(a*a));
		System.out.println(" Cube of Number a = "+(a*a*a));
        //square math formula in SOP

	}

}