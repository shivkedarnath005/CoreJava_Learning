package polymorphism_14;

public class HeroSplendor extends TwoWheeler1 
{
	public void gears() //MultiLevel Inheritance Vehicle-TwoWheeler-HeroSplendor
	{
		System.out.println("Two wheeler has 5 gears");
	}
	public void fuelCapacity()
	{
		System.out.println("Engine fuel capacity is 10 Litre");
	}
	public void speed()
	{
		System.out.println("Speed Limit 80 km");
	}
	
	public static void main(String[] args)
	{
		HeroSplendor obj=new HeroSplendor();
		obj.startEngine();
		obj.gears();
		obj.speed();
		obj.fuelCapacity();
		obj.stopEngine();
		
	}
	
	

}
