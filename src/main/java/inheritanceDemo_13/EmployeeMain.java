package inheritanceDemo_13;

public class EmployeeMain 
{

	public static void main(String[] args)
	{
		Manager mangr=new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager", 5);
		Developer dvpr=new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
		Programmer prgmr=new Programmer("Yaron Gabriel", "3 ABC St", 76000.0,"Senior Programmer","Python");
		
		System.out.println("Manager's Bonus: $" + mangr.calculateBonus());
        System.out.println("Developer's Bonus: $" + dvpr.calculateBonus());
        System.out.println("Programmer's Bonus: $" + prgmr.calculateBonus());

        System.out.println(mangr.generatePerformanceReport());
        System.out.println(dvpr.generatePerformanceReport());
        System.out.println(prgmr.generatePerformanceReport());

        mangr.manageProject();
        dvpr.writeCode();
        prgmr.debugCode();
		
	}

}
