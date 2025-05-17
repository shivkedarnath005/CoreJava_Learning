package practice;

public class CatConstructor 
{
	
	public static String name;
	public static int age;
	
	public CatConstructor()
	{
		this.name="Dolly";
		this.age=2;
	}

	public static void main(String[] args) 
	{
		CatConstructor cat=new CatConstructor();
		
		System.out.println("Cat name is - "+cat.name);
		System.out.println("Cat age is - "+cat.age);

	}

}
