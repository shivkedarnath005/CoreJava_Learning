package iterativeStatements_7;

public class ForEnhan_MaxArray 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5,9};
        int max = numbers[0];
        for (int number : numbers) 
        {
            if (number > max) 
            {
                max = number;
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
    
}
