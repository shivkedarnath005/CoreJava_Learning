package exceptionHandling_22;

/*In Java, the throw keyword is used to explicitly throw 
an exception from a method or any block of code.
Handling Specific Conditions: When certain conditions occur,
 and you want to stop the execution of the current method and 
 propagate an error up the call stack.
*/

public class SpecificConditionExample 
{
    public static void checkNumber(int number) 
    {
        if (number < 0) 
        {
            throw new IllegalArgumentException("Number must be positive.");
        }
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) 
    {
        try 
        {
            checkNumber(-5);
        } 
        catch (IllegalArgumentException e)
        {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

