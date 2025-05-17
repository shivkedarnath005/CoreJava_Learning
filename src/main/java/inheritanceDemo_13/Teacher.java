package inheritanceDemo_13;

public class Teacher extends Human
{
	private String subject;

    public Teacher(String name, int age, String subject)
    {
        super(name, age);//super keyword is used to access properties of parent super class in inheritance
        this.subject = subject;//this keyword is used to access the properties of current class
    }

    public void introduce()//Inherited Human class method overrided
    {
        super.introduce();
        System.out.println("I am a teacher and I teach " + subject + ".");
    }

    public String getSubject() 
    {
        return subject;
    }

}
