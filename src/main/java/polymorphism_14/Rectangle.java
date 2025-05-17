package polymorphism_14;

public class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Rectangle");
	}
	
	public static void main(String[] args)
	{
		Shape s=new Triangle(); //Up Casting to parent shape class
		s.draw();
		Shape s1=new Rectangle();
		s1.draw();
		
		
	}

}
