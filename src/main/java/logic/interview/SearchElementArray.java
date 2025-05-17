package logic.interview;

public class SearchElementArray 
{

	public static void main(String[] args) 
	{
		int [] arr= {3,7,9,4,2,1};
		
		int n=arr.length;
		
		int x=4;
		
		int index=search(arr,x,n);
		
		if(index==-1)
			System.out.println("Element Not Fount in Array");
		else
			System.out.println("Element Found at Position "+index);


	}
	
	public static int search(int [] arr, int x, int n)
	{
		for(int i=0;i<n;i++)
		{
			
		if(arr[i]==x)
			return i;
		
		}
		return -1;
		
	}

}
