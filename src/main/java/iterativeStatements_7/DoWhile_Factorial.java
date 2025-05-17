package iterativeStatements_7;

public class DoWhile_Factorial 
{
    public static void main(String[] args) 
    {
        int number = 5; // Change this number to find the factorial of another number
        int factorial = 1;
        int i = 1;
        do 
        {
            factorial *= i;
            i++;
        } 
        while (i <= number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
