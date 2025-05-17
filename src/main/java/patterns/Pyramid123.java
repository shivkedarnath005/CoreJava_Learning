package patterns;

public class Pyramid123
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
			int x=1;
				
			for(j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
			
			
	}
			
}


