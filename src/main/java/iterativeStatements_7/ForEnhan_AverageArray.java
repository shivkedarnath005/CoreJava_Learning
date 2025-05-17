package iterativeStatements_7;

public class ForEnhan_AverageArray 
{
    public static void main(String[] args) 
    {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0.0;
        for (double number : numbers) 
        {
            sum += number;
        }
        
        double average = sum / numbers.length;
        System.out.println("Average of array elements is: " + average);
    }
    
}

