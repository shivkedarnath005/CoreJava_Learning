package classs.objects.methods_8;

import java.util.Scanner;

public class Calculation 
{
	public int totalMarks()
	{
		int result=0, i,n;
		//int marks[]= {75,80,85,70,72};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of elements in Array");
		n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter All the Elements in Array");
		
		for(i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		for(i=0;i<marks.length;i++)
		{
			result=result+marks[i];	
		}
		System.out.println("Total of Marks "+result);
		return result;	
	}
	
	public double percentage(int total)
	{
		double perc;
		perc=total*100/500;
		return perc;
	}
	
	public void grade(double percent)	
	{
		if(percent>100 && percent<0)
		{
			System.out.println("Invalid input perentage");
		}
		else //nested if else
		{
			if(percent>80 && percent <=100)  //else if ladder independent conditions
			{
				System.out.println("Percentage Grade is A++");
			}
			else if(percent>60 && percent<=80)
			     {
				   System.out.println("Percentage Grade is A");
			     }
			     else if(percent>40 && percent<=60)
			          {
			    	     System.out.println("Percentage Grade is B"); 
			          }
			          else
			          {
			        	  System.out.println("Percentage Grade is Fail");   
			          }
			
		}
		
	}
	

}
