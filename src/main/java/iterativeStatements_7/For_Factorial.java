package iterativeStatements_7;

public class For_Factorial 
{
    public static void main(String[] args) 
    {
        int number = 5; // Change this number to find the factorial of another number
        int factorial = 1;
        for (int i = 1; i <= number; i++) 
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        
    }
    
}