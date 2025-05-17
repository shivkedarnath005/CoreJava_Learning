package staticKeyword_18;

public class Student 
{
	int roll;
	String name;
	static String schoolname="S P College";
	
	public Student (int roll, String name)
	{
		this.roll=roll;
		this.name=name;
		
	}
	
	public void display()
	{
		System.out.println("Student Name= "+name+"\n"+"Roll Number= "+roll+"\n"+"School Name= "+schoolname);
	}
	
	public static void change()
	{
		// roll=10; non static varibale can not be accessed in static method
		schoolname="VJTI Mumbai";
	}
	

}
