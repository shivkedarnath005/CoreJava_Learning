package practice;

public class Dog 
{
	private String name;
	private String color;
	
	
	public Dog(String name, String color)
	{
		this.name=name;
		this.color=color;
	}

	public static void main(String[] args) 
	{
		Dog obj=new Dog("Rocky","Brown");
		
		System.out.println("Dog Name is - "+obj.name);
		System.out.println("Dog Name is - "+obj.color);
		
	}

}
