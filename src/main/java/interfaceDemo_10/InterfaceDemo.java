package interfaceDemo_10;

public interface InterfaceDemo 
{
	public void draw(); //abstract method by default and abstract 
	public default void fillcolour()//default method body implementation
	{
		System.out.println("Default colour is Red");
	}
	public static void outline()//static method body implementation
	{
		System.out.println("Using Black color for outline");
	}

}
