package inheritanceDemo_13;

//Hierarchical inheritance Vehicle class to Two wheeler and Four wheeler class to KiaCar

public class FourWheeler extends Vehicle
{
	public void speed()
	{
		System.out.println("Speed Limit is 100 km");
	}
    public void applyBrakes()
    {
    	System.out.println("Four Wheeler has 2 brakes");
    }
    public void gears()
    {
    	System.out.println("Four Wheeler has 4 gears");
    }
    
    
}
