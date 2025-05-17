package finalKeywordDemo_18;

public class FinalMethodDemo extends Parent
{

	public static void main(String[] args) 
	{
		FinalMethodDemo obj1=new FinalMethodDemo();
		obj1.name();
		obj1.address();
		obj1.phone();
		
	}
	
	public void address() //final method can not be overrided or changed in the child class
	{
		System.out.println("My city is Pune");
	}
	
	public void phone()
	{
		System.out.println("My number is 8960582312");
	}

}
