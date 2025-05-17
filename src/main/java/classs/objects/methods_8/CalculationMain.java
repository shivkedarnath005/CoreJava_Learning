package classs.objects.methods_8;

public class CalculationMain
{

	public static void main(String[] args)
	{
		Calculation obj1=new Calculation();
		int total_marks=obj1.totalMarks();
		
		double percent=obj1.percentage(total_marks);
		
		obj1.grade(percent);
		
	}

}
