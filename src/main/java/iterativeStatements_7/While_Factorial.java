package iterativeStatements_7;

public class While_Factorial 
{
    public static void main(String[] args) 
    {
        int number = 5; // Change this number to find the factorial of another number
        int factorial = 1;
        int i = 1;
        while (i <= number) 
        {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
}
