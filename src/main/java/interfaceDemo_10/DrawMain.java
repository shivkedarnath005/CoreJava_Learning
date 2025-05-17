package interfaceDemo_10;
/*Parent Interface -Drawable
Child Classes - Rectangle and Triangle
Parent Interface - Printable*/

public class DrawMain 
{

	public static void main(String[] args) 
	{
		Drawable obj=new Triangle();//interface reference and no interface object
		obj.draw();
		obj.print();
		obj.fillcolour();
		obj=new Rectangle(); //same object variable name without new reference
		obj.draw();
		obj.print();
		obj.fillcolour();//interface default method is called
		Drawable.outline();//Interface static method called by interface name
		Triangle.outline();//interface static method called by class name
		Rectangle.outline();//interface static method called by class name
		
	}

}
