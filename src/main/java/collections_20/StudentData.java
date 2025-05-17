package collections_20;

public class StudentData 
{
	//Student Data Pojo Class
	int id;
	String name;
	int age; 
	//Create getters and setters ....select data type variable-right click source-generate Getters & Setters
	
	@Override // create print to string variables
	public String toString() 
	{
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}
