package stringDemo_2;

public class StringMethod
{

	public static void main(String[] args) 
	{
		String s="welcome";
		String s1="welcome";
		String s2=new String("welcome");
		
		s2.concat("Java");
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.charAt(1));
		System.out.println(s2.substring(2,5));
		
		System.out.println(s2.indexOf('c'));
		System.out.println(s2.replace('e','o'));
		System.out.println(s2);
		System.out.println(s2.length());
		String s4="  Java Hello  "; //extra space outside string not in between string
		System.out.println(s4.trim());
		
	}
}
