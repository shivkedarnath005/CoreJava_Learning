package interfaceDemo_10;

public interface Drawable extends Printable
{
	public void draw(); //abstract method by default and abstract 
	public default void fillcolour()//default method implementation
	{
		System.out.println("Default colour is Red");
	}
	public static void outline()//static method
	{
		System.out.println("Using Black color for outline");
	}
	

}
