package abstractDemo_11;

public class HRTeam extends ITDepart
{

	public static void main(String[] args)
	{
		
		//Scenario 1
		HRTeam hr=new HRTeam();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		ITDepart it=new HRTeam();
		it.goodies();
		it.work();
		it.salary();
		
		/*
		 * the interface class and abstract class object can not be created as those
		 * class are not fully implemented interface class is 100 % abstraction
		 * abstract class can be 0-100 % abstraction as abstract method and non
		 * abstract methods
		 */
	}
	
	public void bonus()
	{
		System.out.println("Bonus is 1 Lakh");
	}

	
	public void salary() 
	{
		System.out.println("5LPA Salary Package");
		
	}

}
