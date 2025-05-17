package logic.interview;

public class ArrayMinValue 
{

	public static void main(String[] args) 
	{
		int arr[]= {6,3,9,4,10,15};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Value in Array is "+min);



	}

}
