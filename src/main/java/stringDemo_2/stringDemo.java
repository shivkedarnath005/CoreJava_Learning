package stringDemo_2;
public class stringDemo 
{
    public static void main(String[] args)
	{
		String s="Hello";
		System.out.println("Before Concatination "+s);
		s.concat("Java");
		System.out.println("After Concatination "+s);
		
		String s1=new String("Hello");
		System.out.println("Before Concatination "+s1);
		s1.concat("C++");
		System.out.println("After Concatination "+s1);
		
		StringBuffer sb=new StringBuffer("Java");
		System.out.println("Before Append "+sb);
		sb.append("Tutorial");
		System.out.println("After Append "+sb);
		
		StringBuilder sf=new StringBuilder("Study");
		System.out.println("Before Append "+sf);
		sf.append("Point");
		System.out.println("After Append "+sf);
			
	}
}
