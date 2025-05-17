package stringDemo_2;

public class StringReverse 
{

	public static void main(String[] args)
	{
		String s="application";
		char c[]=s.toCharArray(); //String class method for char array
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		System.out.println();
		
		//------Using Reverse Method----------
		StringBuilder sb=new StringBuilder("hello");
		StringBuilder sb1=sb.reverse();
		System.out.println("Using Reverse Method = "+sb1);
	}
}
