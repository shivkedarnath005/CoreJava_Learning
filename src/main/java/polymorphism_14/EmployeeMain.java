package polymorphism_14;

/*Parent class- Employee
Child Classes - Manager and Programmer*/

public class EmployeeMain
{

	public static void main(String[] args)
	{
		Employee emp1=new Manager("Lilo Heidi", 7500.00, 1500.00);
		Employee emp2=new Programmer("Margaret Catherine", 5000.00, 600.00);
		
		System.out.println("Manager : "+emp1.getName()+"\nRole :"+emp1.getRole()+"\nSalary: $"+emp1.calculateSalary());
		System.out.println("Manager : "+emp2.getName()+"\nRole :"+emp2.getRole()+"\nSalary: $"+emp2.calculateSalary());
		
	}

}
