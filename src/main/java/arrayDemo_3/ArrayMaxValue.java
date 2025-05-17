package arrayDemo_3;

public class ArrayMaxValue 
{

	public static void main(String[] args)
	{
		int a[]= {10,50,2,60,100};
		int max=a[0]; //initialize the variable with first array element index
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max Value is = "+max);
		

	}

}
