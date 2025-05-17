package stringDemo_2;

public class StringComparison
{

	public static void main(String[] args)
	{
		String s1="Java";
		String s2="java";
		String s3=new String("java");
		String s4=new String("java");
		String s11=new String ("j ava");
		
		System.out.println(s1.equals(s2)); //space between char is compared
		System.out.println(s2.equals(s3)); //no upper or lower case accepted ,equalsIgonreCase() method
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s11));
		
		System.out.println(s1==s2); //string constant pool memory location reference same
		System.out.println(s2==s3);// string heap memory location reference is different
		System.out.println(s3==s4);
		
		// leftstring = rightstring  return zero value output
		System.out.println(s1.compareTo(s2)); //lexicographical ASCII Value comparison of string chars
		System.out.println(s2.compareTo(s3));//leftstring>rightstring - positive number
		System.out.println(s3.compareTo(s4));//leftstring<rightstring - negative number
		
		String s5="Study";
		System.out.println(s5.equals("Study"));
		System.out.println(s5.equals("Stu"));
		System.out.println(s5.contains("Stu"));
		System.out.println(s5.contains("uts"));
		
			
	}
}
