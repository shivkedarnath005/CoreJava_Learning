package polymorphism_14;

public class KiaCar1 extends FourWheeler1
{
	public void speed()
	{
		System.out.println("Speed Limit is 200 km");
	}
	public void gears()
	{
		System.out.println("Now gears are 5");
	}
	public void fuelCapacity()
	{
		System.out.println("Kia Engine fuel capacity is 45 litres ");
	}
	public void frontCam()
	{
		System.out.println("Kia Front Camera is working");	
	}
	public void backCam()
	{
		System.out.println("Kia Back camera is working");
	}
	public void alignment()
	{
		System.out.println("Align Accordingly");
	}
	public void modelName()
	{
		System.out.println("Kia Car Model name is Sonet");
	}
	
	public static void main(String [] args)
	{
		KiaCar1 obj=new KiaCar1();
		obj.startEngine();
		obj.speed();
		obj.gears();
		obj.applyBrakes();
		obj.modelName();
		obj.frontCam();
		obj.backCam();
		obj.fuelCapacity();
		obj.stopEngine();
		
	}

}
