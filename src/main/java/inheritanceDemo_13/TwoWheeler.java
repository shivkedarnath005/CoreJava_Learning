package inheritanceDemo_13;

//Hierarchical inheritance Vehicle class to Two wheeler and Four wheeler class to KiaCar

public class TwoWheeler extends Vehicle
{
	public void fuelCapacity()
	{
		System.out.println("Engine fuel capacity is 5 Litre");
	}
	
	public void gears()
	{
		System.out.println("Two wheeler has 5 gears");
	}
	
	public void chargingCapacity()
	{
		System.out.println("You can charge your mobile in Socket");
	}
	
	public static void main(String[] args)
	{
		TwoWheeler obj1=new TwoWheeler();
		
		obj1.startEngine();
		obj1.gears();
		obj1.chargingCapacity();
		obj1.fuelCapacity();
		obj1.stopEngine();
		
	}

}
