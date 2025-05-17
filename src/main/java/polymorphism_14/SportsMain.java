package polymorphism_14;

/*Parent Class - Sports
Child Classes - Football, Basketball,Rugby*/

public class SportsMain {

	public static void main(String[] args)
	{
		Sports obj1=new Sports();
		Football obj2=new Football();
		Basketball obj3=new Basketball();
		Rugby obj4=new Rugby();
		
		obj1.play();
		obj2.play();
		obj3.play();
		obj4.play();
		
	}

}
