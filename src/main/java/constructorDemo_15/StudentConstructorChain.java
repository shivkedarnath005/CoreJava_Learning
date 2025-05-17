package constructorDemo_15;

public class StudentConstructorChain 
{

	int result;
	
	public static void main(String[] args)
	{
		StudentConstructorChain obj1=new StudentConstructorChain(1);
		StudentConstructorChain obj2=new StudentConstructorChain("Maharashtra Vidayalaya");
		obj1.displayResult();
		
	
	}
	public StudentConstructorChain() //Constructor chain call by first statement as this keyword
	{
		this("Maharashtra Vidayala");
	    System.out.println("Hey Welcome to School");	
	}
	
	public StudentConstructorChain(String schoolname)
	{
	    System.out.println("Hey Welcome to "+ schoolname +" School");	
	}
	
	public StudentConstructorChain(int rank)
	{
		this("SP College",1);
	    System.out.println("Hey Welcome to School Ranked "+ rank);	
	}
	
	public StudentConstructorChain(String schoolname, int rank)
	{
		this(3,"Garware College");
	    System.out.println("Hey Welcome to"+schoolname+"ranked"+rank+" School");
	  
	}
	
	public StudentConstructorChain(int rank,String schoolname)
	{
	    System.out.println("Hey Welcome to"+rank+"ranked"+schoolname+" School");
	  
	}
	
	public void displayResult()
	{
		System.out.println("Final Marks for Student is "+ result);
	}

}
