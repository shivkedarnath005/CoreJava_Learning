package inheritanceDemo_13;

public class Developer extends Employee
{
	private String programLang;

	public Developer(String name, String address, double salary, String jobTitle, String programLang)
	{
		super(name, address, salary, jobTitle);
		this.programLang = programLang;
	}
	public String getProgramLang()
	{
		return programLang;
	}
	public double calculateBonus()
	{
		return getSalary()*0.10;
	}
	public String generatePerformanceReport()
	{
		return "Performance report for Developer " + getName() + ": Good";
	}
	public void writeCode()
	{
		System.out.println("Developer is "+getName()+"writing code in "+programLang);
	}
	

}
