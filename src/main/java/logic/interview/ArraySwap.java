package logic.interview;

public class ArraySwap 
{

	public static void main(String[] args) 
	{
		int a[]= {0,1,2,3,4,5,6,7,8,9,};
		int b[]=new int[10];
		int i,j=9;
		
		for(i=0;i<a.length;i++) //we can use another for loop for b array
		{
			for(j=9;j>b.length;j--)
			{
				a[i] = a[i] + b[j];
			    b[j] = a[i] - b[j]; 
			    a[i] = a[i] - b[j];
			    
			}
		}
		
		for(i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}

	}

}
