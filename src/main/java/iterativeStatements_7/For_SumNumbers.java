package iterativeStatements_7;

public class For_SumNumbers 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++) 
        {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}
