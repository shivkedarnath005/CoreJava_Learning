package arrayDemo_3;

import java.util.Scanner;

public class arrayDemo2 
{

	public static void main(String[] args) 
	{
		int a[][]=new int [2][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<2;i++) //rows outer loop
		{
			for(j=0;j<3;j++) //columns inner loop
			{
				System.out.println("Enter Array Element ");
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Entered Array Matrix = ");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");	//printing in one row with tab space between column inner loop
			}
			System.out.println(); //new row line print will start outer loop
		}
	}
}
