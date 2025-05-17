package patterns;

public class DiamondPattern
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

			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		for(i=4;i>=1;i--) //nested for loops three
		{

			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
			}

			for(j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();

		}

	}


}


