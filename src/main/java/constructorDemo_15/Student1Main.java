package constructorDemo_15;

//main method of student1 constructor call

public class Student1Main 
{

	public static void main(String[] args)
	{
		Student1 s1=new Student1();//if parameter constructor is called we cant call default constructor
		s1.display();
		Student1 s2=new Student1(101,"Riya"); //if you want more constructor call create more objects
		s2.display();
		Student1 s3=new Student1(102);
		s3.display();
	
	}

}
