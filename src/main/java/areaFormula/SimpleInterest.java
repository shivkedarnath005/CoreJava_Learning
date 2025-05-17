package areaFormula;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) 
	{
		
		
		int P;
		float Simple_Interest,T,R;//variable declaration
		
		Scanner sc=new Scanner(System.in);
		//sc is the object of scanner class
		//new keyword use to allocate the memory of a class
		//System.in for accepting the data from keyword
		
		System.out.println("Enter a Value for Principle");
		P=sc.nextInt();
		//sc object calling the method to input value
		
		
		System.out.println("Enter a Value for Time Period ");
		T=sc.nextFloat();
		//sc object calling the method to input value
		
		System.out.println("Enter a Value for Interest Rate");
		R=sc.nextFloat();
		//sc object calling the method to input value
		
		Simple_Interest=P*T*R/100;
		// Simple Interest Math Formula
		
		System.out.println("Simple Interest Calculation = "+Simple_Interest);

		
	}

}