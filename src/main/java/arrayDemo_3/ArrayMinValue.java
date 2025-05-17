package arrayDemo_3;

public class ArrayMinValue 
{

	public static void main(String[] args)
	{
		int a[]= {10,50,2,60,100};
		int min=a[0]; //initialize the variable with first array element index
		
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Min Value is = "+min);
	
	}

}
