package inheritanceDemo_13;

//Businessman is child class of Human class

public class Businessman extends Human
{
	private String companyName;

    public Businessman(String name, int age, String companyName) 
    {
        super(name, age); //super keyword is used to access properties of parent super class in inheritance
        this.companyName = companyName; //this keyword is used to access the properties of current class
    }

    public void introduce() //human class method overrided
    {
        super.introduce();
        System.out.println("I am a businessman and I run " + companyName + ".");
    }

    public String getCompanyName() 
    {
        return companyName;
    }

	

}
