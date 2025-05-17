package inheritanceDemo_13;

public class HumanMain 
{
		 public static void main(String[] args) 
		 {
		        Human human = new Human("John Doe", 30);
		        human.introduce();
		        human.getName();
		        human.getAge();

		        Businessman bman = new Businessman("Elon Musk", 40, "TESLA");//parmeterized constructor call
		        bman.introduce();
		        bman.getCompanyName();

		        Teacher teacher = new Teacher("Bob Smith", 35, "MATHEMATICS");//parmeterized constructor call
		        teacher.introduce();
		        teacher.getSubject();

		        Footballer footballer = new Footballer("David Beckham", 32, "MANCHESTER UNITED");//parmeterized constructor call
		        footballer.introduce();
		        footballer.getTeamName();
		    
	     }

}
