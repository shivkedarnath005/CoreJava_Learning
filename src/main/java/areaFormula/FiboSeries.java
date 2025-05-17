package areaFormula;

public class FiboSeries 
{

	public static void main(String[] args) 
	{
		int i,f1,f2,f3;
		f1=1;
		f2=1;
		System.out.println(f1+"\n"+f2); //\n for new line
		
		for(i=1;i<=20;i++)
		{
			f3=f1+f2;
			System.out.println(f3);
			
			f1=f2; // swapping the values
			f2=f3;
		}
		

	}

}
