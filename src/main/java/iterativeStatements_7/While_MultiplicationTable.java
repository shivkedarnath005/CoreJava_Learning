package iterativeStatements_7;

public class While_MultiplicationTable 
{
    public static void main(String[] args) 
    {
        int number = 5; // Change this number to get the multiplication table for another number
        int i = 1;
        while (i <= 10) 
        {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
    
}

