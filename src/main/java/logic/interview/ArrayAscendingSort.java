package logic.interview;

public class ArrayAscendingSort 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,50,2,60,100};
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
		System.out.println("Array after sorting in ascending order");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}



	}

}
