package arrayDemo_3;

public class ArraySortAscending 
{

	public static void main(String[] args) 
	{
		int a[]= {10,50,2,60,100};
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)//j can be initialized to j=0
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array After Sorting in Ascending Order ");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}

	}

}
