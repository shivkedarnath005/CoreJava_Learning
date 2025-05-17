package iterativeStatements_7;

import java.util.Scanner;

public class DoWhile_ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        do 
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        } 
        while (number != 0);

        System.out.println("Reversed number is: " + reverse);
    }
}
