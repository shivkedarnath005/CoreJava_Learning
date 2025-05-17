package practice;

public class Rectangle implements Shape
{
	public int getAreaRectangle(int length, int breadth)
	{
		
		int rarea =length*breadth;
	
		System.out.println("The Area of Rectangle is "+rarea);
		return rarea;
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
