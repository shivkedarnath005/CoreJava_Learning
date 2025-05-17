package interfaceDemo_10;

public class Triangle implements Drawable,Printable//many interfaces can be inherited
{

	public void draw() 
	{
		System.out.println("Draw a Triangle");
			
	}
	public void fillcolour()//default interface method is overrided
	{
		System.out.println("Triangle colour is Yellow");
		
	}
	public static void outline()
	{
		System.out.println("Using Green colour for Triangle outline");
	}
	
	@Override
	public void print() 
	{
		System.out.println("Print Triangle");
		
	}
	
}
