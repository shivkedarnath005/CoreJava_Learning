package arrayDemo_3;
import java.util.Scanner;

public class TwoArrayAddition 
{

	public static void main(String[] args) 
	{
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int c[][]=new int [3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered Matrix a = ");
		
		
		for(i=0;i<3;i++) //rows outer loop
		{
			for(j=0;j<3;j++) //columns inner loop
			{
				System.out.println("Enter Array Element ");
				a[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("Entered Matrix b = ");
		
		for(i=0;i<3;i++) //rows outer loop
		{
			for(j=0;j<3;j++) //columns inner loop
			{
				System.out.println("Enter Array Element ");
				b[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Entered Matrix c = ");
		
		for(i=0;i<3;i++) //rows outer loop
		{
			for(j=0;j<3;j++) //columns inner loop
			{
				c[i][j]=a[i][j]+b[i][j];				
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"\t");	//printing in one row with tab space between column inner loop
			}
			System.out.println(); //new row line print will start outer loop
		}

	}

}
