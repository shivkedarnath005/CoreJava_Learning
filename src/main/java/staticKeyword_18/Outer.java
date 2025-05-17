package staticKeyword_18;

public class Outer 
{
	static String msg="Hello";
	
	static class Inner//not public class
	{
		static void getMsg()
		{
			System.out.println("Message= "+msg);
		}
		
	}

}
