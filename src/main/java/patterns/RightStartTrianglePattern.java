package patterns;

public class RightStartTrianglePattern 
{

	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=5;i++) //number of row  print
		{                      //j loop starts again from 1 and repeat all
			for(j=1;j<=i;j++) //j execute i times & number of values in single row
			{
				System.out.print("* "); //class.object.method
			}
			System.out.println();
		}
		

	}
	

}
