package iterativeStatements_7;

public class ForEnhan_SumArray 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) 
        {
            sum += number;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
    
}
