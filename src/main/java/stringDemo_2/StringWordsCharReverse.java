package stringDemo_2;

public class StringWordsCharReverse 
{

	public static void main(String[] args) 
	{
		String c="h e l l o";
		System.out.println(c.replace(" ", ""));
		//reverse words not character reverse in sequence
		String s="i love india";
		String s1[]=s.split(""); //split the sting at space
		System.out.println("After Reverse Words ");
		for(int i=s1.length-1;i>=0;i--) //reverse loop count
		{
			System.out.print(s1[i]+" ");
		}
	}
}
