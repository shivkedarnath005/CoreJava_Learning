package classs.objects.methods_8;

import java.util.Scanner;

public class MathFormulaMain
{

	public static void main(String[] args) 
	{
		MathFormula obj1=new MathFormula();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character for calculation");
		char x=sc.next().charAt(0);
		switch(x)
		{
		   case's':
			   obj1.square();
			   break;
		   case'c':
			   obj1.cube();
			   break;
		   case'f':
			   obj1.factorial();
			   break;
		   default:
			   System.out.println("Sorry no input");
			   break;
	
		}
	}

}
