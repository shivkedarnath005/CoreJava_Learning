package arrayDemo_3;

import java.util.Scanner;

public class ArrayDemo
{

	public static void main(String[] args) 
	{
		int a[] =new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println(a.length);
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
			
		}
       System.out.println("Entered Element");
       
       for(i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+"\t");
       }
	}

}
