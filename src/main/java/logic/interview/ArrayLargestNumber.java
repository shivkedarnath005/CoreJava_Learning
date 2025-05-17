package logic.interview;

public class ArrayLargestNumber
{
	
	public static int [] arr= {10, 324, 45, 90, 9808};

	public static void main(String[] args) 
	{
		System.out.println("Largest in given Array is : "+ largest());

	}
	
	public static int largest()
	{
		int i;
		int max=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}

}
