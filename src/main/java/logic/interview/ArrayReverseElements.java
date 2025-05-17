package logic.interview;

public class ArrayReverseElements 
{

	public static void main(String[] args) 
	{
		int [] arr= {15,63,25,95,45,90};
		int i;
		
		System.out.println("Original array: ");  
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		
		System.out.println("Array after swapping : ");
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + "\t");
		}
		
		
	}

}
