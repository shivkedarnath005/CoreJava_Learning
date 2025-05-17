package practice;

public class StringOperations 
{

	public static void main(String[] args) 
	{
		String str1="Selenium";
		String str2="Automation";
		String str4="Selenium Framework";
		String str5="  TestNG  ";
		String str3;
		
		System.out.println("String Concatination");
		str3=str1.concat(str2);
		System.out.println(str3);
		
		System.out.println("String Equals Check");
		boolean b=str1.equals(str2);
		System.out.println(b);
		
		System.out.println("String Character at Specified Index");
		char c=str1.charAt(1);
		System.out.println(c);
		
		System.out.println("String Contains the string");
		b=str4.contains(str1);
		System.out.println(b);
		
		System.out.println("String Convert to Upper Case Letters");
		str3=str1.toUpperCase();
		System.out.println(str3);
		
		System.out.println("String Convert to Lower Case Letters");
		str3=str2.toLowerCase();
		System.out.println(str3);
		
		System.out.println("String Trims White Spaces from Both Sides");
		str3=str5.trim();
		System.out.println(str3);
		
		System.out.println("Get Substring from specified index to end");
		str3=str1.substring(2);
		System.out.println(str3);
			

	}

}
