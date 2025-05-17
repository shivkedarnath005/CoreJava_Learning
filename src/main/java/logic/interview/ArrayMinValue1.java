package logic.interview;

public class ArrayMinValue1 
{

	public static void main(String[] args) 
	{
		int[] arr= {75,10,50,23,84,12};
		int i;
		int min=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Number in Array : "+min);

	}

}
