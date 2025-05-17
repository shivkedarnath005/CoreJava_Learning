package logic.interview;

public class ArraySwapping 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		
		if(arr1.length!=arr2.length)
		{
			System.out.println("Two arrays length must be same");
			return;
		}
		
		for(int i=0;i<arr1.length;i++)
		{

			int temp=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp;
		}
		
		System.out.println("Array 1 :");
		
		for(int num : arr1)
		{
			System.out.print(num + "\t");
		}
		System.out.println();
		
        System.out.println("Array 2 :");
		
		for(int num : arr2)
		{
			System.out.print(num + "\t");
		}
		System.out.println();
		

	}

}
