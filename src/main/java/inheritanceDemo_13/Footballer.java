package inheritanceDemo_13;

public class Footballer extends Human
{
	private String teamName;

    public Footballer(String name, int age, String teamName)
    {
        super(name, age);//super keyword is used to access properties of parent super class in inheritance
        this.teamName = teamName;//this keyword is used to access the properties of current class
    }

    public void introduce() //inherited super class method is overrided
    {
        super.introduce();
        System.out.println("I am a footballer and I play for " + teamName + ".");
    }

    public String getTeamName()
    {
        return teamName;
    }

}
