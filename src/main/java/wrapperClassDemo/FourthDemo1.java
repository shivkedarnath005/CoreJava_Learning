package wrapperClassDemo;

public class FourthDemo1 
{

	public static void main(String[] args)
	{
		//Auto boxing without calling method
		int a=100;
		Integer b=a;
		System.out.println("Autoboxing"+b);
		
		//Normal Boxing by calling method
		int x=90;
		Integer y=Integer.valueOf(x);
		System.out.println("Boxing"+y);
		
		//Normal Unboxing by calling method
		Integer result=100;
		int newResult=result.intValue();
		System.out.println("Unboxing"+newResult);
		
		//AutoUboxing without method
		Integer marks=78;
		int newMarks=marks;
		System.out.println("Auto Unboxing"+newMarks);

	}

}
