package polymorphism_14;

public class TwoWheeler1 extends Vehicle1
{
	
	public void speed()
	{
		System.out.println("Speed Limit 50km");
	}
	public void fuelCapacity()
	{
		System.out.println("Engine fuel capacity is 5 Litre");
	}
	public void gears()
	{
		System.out.println("Two wheeler has 4 gears");
	}
	public void chargingCapacity()
	{
		System.out.println("You can charge your mobile in Socket");
	}
	
	public static void main(String[] args)
	{
		TwoWheeler1 obj1=new TwoWheeler1();
		
		obj1.startEngine();
		obj1.gears();
		obj1.chargingCapacity();
		obj1.fuelCapacity();
		obj1.stopEngine();
		
	}

}
