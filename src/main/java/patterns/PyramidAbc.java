package patterns;

public class PyramidAbc
{

	public static void main(String[] args) 
	{
		int n=5;//number of rows
		
		for(int i=1;i<=n;i++)
		{
			//print the spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");	
			}
			//Print characters in ascending order
			char currentChar='a';
			
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(currentChar+" ");
				currentChar++;
			}
			System.out.println();
			
		}
			
		
		
	}
			
}


