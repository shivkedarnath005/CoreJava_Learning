package classObjectDemo;

public class SecondclassDemo
{

	public static void main(String[] args) 
	{
		Calculator obj1 = new Calculator();
		
		obj1.sum();
		
		obj1.sub();
		
		System.out.println("Name is "+obj1.name);
		
		System.out.println("Hobby is "+obj1.hobby);
		
	}

}
