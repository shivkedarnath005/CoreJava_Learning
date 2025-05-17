package inheritanceDemo_13;

public class Programmer extends Developer
{

	public Programmer(String name, String address, double salary, String jobTitle, String programLang)
	{
		super(name, address, salary, "programmer", programLang);
		
	}
	public double calculateBonus()
	{
		return getSalary()*0.12;
	}
	public String generatePerformanceReport()
	{
		return "Performance report for Programmer " + getName() + ": Excellent";
	}
	public void debugCode()
	{
		System.out.println("Programmer " + getName() + " is debugging code in " + getProgramLang());
	}
	
}
