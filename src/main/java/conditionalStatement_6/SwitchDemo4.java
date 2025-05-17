package conditionalStatement_6;
import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		char x;
		System.out.println("Arithmetic Operations Switch Cases");
		System.out.println("Please enter the Number Values & Operator");
		a=sc.nextInt();
		b=sc.nextInt();
		x=sc.next().charAt(0);
		
		switch(x)
		{
		  case '+':
			  c=a+b;
			  System.out.println("Addition of Two Numbers="+c);
		      break;
		  case '-':
			  c=a-b;
			  System.out.println("Subtraction of Two Numbers="+c);
	          break;
	      case '*':
	    	  c=a*b;
	    	  System.out.println("Multiplication of Two Numbers="+c);
	          break;
	      case '/':
	    	  c=a/b;
	    	  System.out.println("Division of Two Numbers="+c);
	          break;
	      default:
	    	  System.out.println("Sorry No Arithmetic Operation");
		      break;
		      
		}
		

	}

}
