package inheritanceDemo_13;

public class Manager extends Employee 
{
	private int numberOfSubordinates;

	public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) 
	{
		super(name, address, salary, jobTitle);
		this.numberOfSubordinates=numberOfSubordinates;	
	}
	
	public int getNumberOfSubordinates()
	{
		return numberOfSubordinates;
	}
	
	public double calculateBonus()
	{
		return getSalary()*0.15;
	}
	
	public String generatePerformanceReport()
	{
		return "Performance report for Manager " + getName() + ": Excellent";
	}
	
	public void manageProject()
	{
		System.out.println("Manager " + getName() + " is managing a project.");
	}
	

}
