package staticKeyword_18;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		Student obj=new Student(1,"Amol");
		obj.display();
		Student.change();
		
		System.out.println(Student.schoolname);//class name call of static variable
		Student obj1=new Student(2,"Riya");
		obj1.display();//non static method call by object
		
		Student obj2=new Student(3,"Rohan");
		obj2.display();
	
	}

}
