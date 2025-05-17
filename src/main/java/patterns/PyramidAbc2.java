package patterns;

public class PyramidAbc2
{

	public static void main(String[] args) 
	{
        int i,j,k;
		
		for(i=1;i<=5;i++) //nested for loops three
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			char  currentChar='a';
				
			for(j=1;j<=i;j++)
			{
				System.out.print(currentChar +" ");
				currentChar++;
			}
			System.out.println();
		}
		
			
		
		
	}
			
}


