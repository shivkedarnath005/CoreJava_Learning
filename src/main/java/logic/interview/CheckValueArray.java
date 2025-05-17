package logic.interview;

import java.util.Arrays;

public class CheckValueArray 
{
	private static void check(int[] arr, int toCheckValue)
	{
		boolean test=false;
		for(int element : arr)
		{
			if(element==toCheckValue)
			{
				test=true;
				break;
			}
		}
		System.out.println("Is "+toCheckValue+" is present in array :"+test);
		
	}

	public static void main(String[] args) 
	{
		int[] arr= {5,1,1,6,8,9,4,3,2,4,6};
		
		int toCheckValue=9;
		System.out.println("Array: "+Arrays.toString(arr));
		
		check(arr, toCheckValue);
		

	}

}
