package exceptionHandling_22;

//InvalidAgeException Class used with this.
/*In Java, the throw keyword is used to explicitly throw 
an exception from a method or any block of code.
The throw keyword is typically used in the following scenarios:
	Creating Custom Exceptions: When you want to create and throw 
	custom exceptions based on specific conditions in your program.
*/
public class CustomExceptionExample 
{
    public static void validateAge(int age) throws InvalidAgeException 
    {
        if (age < 18) 
        {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        }
    }

    public static void main(String[] args) 
    {
        try 
        {
            validateAge(16);
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    
}

