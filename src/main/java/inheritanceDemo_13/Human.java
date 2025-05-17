package inheritanceDemo_13;

//Hierarchical inheritance Human class to child class Businessman, 
//Footballer, Teacher & HumanMain class

public class Human
{
	private String name;
    private int age;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void introduce()
    {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

}
