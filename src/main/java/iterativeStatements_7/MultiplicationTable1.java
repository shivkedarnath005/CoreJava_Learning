package iterativeStatements_7;

public class MultiplicationTable1 
{
	
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) //outer loop number of rows
        {
            for (int j = 1; j <= 10; j++) //inner loop number of columns
            {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
