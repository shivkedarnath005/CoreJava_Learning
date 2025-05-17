package practice;

public class Triangle implements Shape
{
	public double getAreaTriangle(double base, double height)
	{
		
		double tarea =base*height/2;
	
		System.out.println("The Area of Triangle is "+tarea);
		return tarea;
	}

	@Override
	public int getAreaRectangle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAreaTriangle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAreaCircle() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
