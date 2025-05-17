package thisKeywordDemo_16;

public class ThisDemo
{
	//this keyword acts like current class object reference
	int amount=1000;
	public ThisDemo() //default constructor
	{
		this(10);//this keyword calling ThisDemo int constructor chain call execution
		System.out.println("Constructor1 is executing");
		
	}
	public ThisDemo(int a)
	{
		this("Hello");  //this keyword calling ThisDemo string constructor
		System.out.println("Constructor2 is executing");
	}
	public ThisDemo(String s) //this keyword should be used in first line of execution
	{
		System.out.println("Constructor3 is executing");
	}
	public void m()
	{
		this.n(); //this keyword calling n() method
	}
	public void n()
	{
		//this.amount; // this keyword is calling instance variable
		System.out.println("The amount is = "+this.amount);
		System.out.println("Method n is executing");
	}
	

}
