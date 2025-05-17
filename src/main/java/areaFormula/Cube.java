package areaFormula;
import java.util.Scanner;

public class Cube {

	public static void main(String[] args) 
	{
		
		
		int a,c;//variable declaration
		
		Scanner sc=new Scanner(System.in);
		//sc is the object of scanner class
		//new keyword use to allocate the memory of a class
		//System.in for accepting the data from keyboard
		
		System.out.println("enter a value for a");
		a=sc.nextInt();
		//sc Object calling the method
		
		
		c=a*a*a;
		
		System.out.println(" Cube of a Number is ="+c);

	}

}