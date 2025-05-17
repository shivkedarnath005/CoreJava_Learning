package inheritanceDemo_13;

//Hierarchical inheritance Vehicle class to Two wheeler and Four wheeler class to KiaCar

public class KiaCar extends FourWheeler
{
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
		KiaCar obj=new KiaCar();
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
