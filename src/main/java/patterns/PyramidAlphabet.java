package patterns;

public class PyramidAlphabet
{

	public static void main(String[] args) 
	{
		int i,j,k;
		char currentChar='a'; //Starting character
		
		for(i=1;i<=5;i++) //nested for loops three
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
				
			for(j=1;j<=i;j++)
			{
				System.out.print(currentChar + " ");
				currentChar++;
			}
			System.out.println();
		}
		
	}
		

	}


