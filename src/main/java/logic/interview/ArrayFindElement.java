package logic.interview;

import java.util.Arrays;

public class ArrayFindElement 
{

	public static void main(String[] args) 
	{
		int [] arr= {15,63,25,95,45,90};
		
		int toCheckValue=25;
		boolean test=false;
		
		for(int ele : arr)
		{
			if(toCheckValue==ele)
			{
				test=true;
				break;
			}
		}
		
		System.out.println("The Element "+ toCheckValue + " is present in array " + test);
		
		System.out.println("Array : " + Arrays.toString(arr));

	}

}
