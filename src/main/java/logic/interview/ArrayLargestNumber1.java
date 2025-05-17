package logic.interview;

public class ArrayLargestNumber1 
{

	public static void main(String[] args) 
	{
		int[] arr= {75,10,50,23,84,12};
		int i;
		int max=arr[0];
		
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largets Number in Array : "+max);

	}

}
