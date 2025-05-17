package logic.interview;

public class ArraySwapElements 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};

		System.out.println("Arrays Before swapping:");
		printArrays(arr1, arr2);

		// Swap elements between the arrays
		swapElements(arr1, arr2);

		System.out.println("Arrays After swapping:");
		printArrays(arr1, arr2);

	}

	public static void swapElements(int[] array1, int[] array2)
	{
		if(array1.length!=array2.length)
		{
			System.out.println("Two arrays length must be same");
			return;
		}

		for(int i=0;i<array1.length;i++)
		{

			int temp=array1[i];
			array1[i]=array2[i];
			array2[i]=temp;
		}
    }
	
	public static void printArrays(int[] array1, int[] array2)
	{
		System.out.println("Array 1 :");
		
		for(int num : array1)
		{
			System.out.print(num + "\t");
		}
		
		System.out.println();
		
		System.out.println("Array 2 :");
		
		for(int num : array2)
		{
			System.out.print(num + "\t");
		}
		
		System.out.println();
		
		
			
	}
	
}


