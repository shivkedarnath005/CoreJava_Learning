package practice;

public class Circle implements Shape
{
	public double getAreaCircle(double radius)
	{
		
		double carea =3.14*radius*radius;
	
		System.out.println("The Area of Circle is "+carea);
		return carea;
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
