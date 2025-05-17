package superKeywordDemo_17;

public class Account extends Employee
{
	int salary;
	public Account(int id,String name, int salary)
	{
		super(id,name);
		this.salary=salary;	
	}
	public void display()
	{
		System.out.println("Name = "+name+"\n"+"id= "+id+"\n"+"Salary= "+salary);
	}//\n is used to print on new line and \t is used to print tab space between in one row

	public static void main(String[] args) 
	{
		Account obj=new Account(1,"Ravi",25000);
		obj.display();
		

	}

}
