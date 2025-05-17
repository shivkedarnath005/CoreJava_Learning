package interfaceDemo_10;

public class Rectangle implements Drawable,Printable
{

	@Override
	public void draw() 
	{
		System.out.println("Draw a Rectangle");
		
	}
	public static void outline()
	{
		System.out.println("Using Pink colour for Rectangle outline");
	}
	
	@Override
	public void print() 
	{
		System.out.println("Print Rectangle");
		
	}

}
