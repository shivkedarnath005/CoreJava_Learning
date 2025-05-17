package logic.interview;

public class ArrayAscendingSort1
{

	public static void main(String[] args) 
	{
		int[] arr= {75,10,50,23,84,12};
		int i,j;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{

				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array in Ascending order after sorting :");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}

	}

}
