package arrayDemo_3;

public class ArraySumAndAverage 
{

	public static void main(String[] args) 
	{
		int [] numbers= {10,20,30,40,50};
		int sum=0;
		
		//Use Enhanced For loop use with data structures like array, set & list
		for(int counter :numbers)
		{
			sum=sum+counter;
			
		}
		double avg=(double)sum/numbers.length;
		System.out.println("Sum of Array Elements "+sum);
		System.out.println("Average of Array Elements "+avg);
		

	}

}
