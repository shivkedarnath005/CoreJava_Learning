package polymorphism_14;

/*Parent class- Employee
Child Classes - Manager and Programmer*/

public class Employee
{
	private String name;
	private String role;
	
	public Employee(String name, String role)
	{
		this.name=name;
		this.role=role;	
	}
	public String getName()
	{
		return name;
	}
	public String getRole()
	{
		return role;
	}
	public double calculateSalary()
	{
		return 0.0;
	}

}
