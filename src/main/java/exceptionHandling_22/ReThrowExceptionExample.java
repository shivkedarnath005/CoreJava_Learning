package exceptionHandling_22;

/*In Java, the throw keyword is used to explicitly throw 
an exception from a method or any block of code.
Re-throwing an Exception: When you want to catch an 
exception and then re-throw it to be handled at a higher level.
*/

public class ReThrowExceptionExample 
{
    public static void methodA() throws Exception 
    {
        try 
        {
            methodB();
        } 
        catch (Exception e) 
        {
            System.out.println("Caught in methodA: " + e.getMessage());
            throw e; // Re-throwing the exception
        }
    }

    public static void methodB() throws Exception 
    {
        throw new Exception("Exception in methodB");
    }

    public static void main(String[] args) 
    {
        try 
        {
            methodA();
        } 
        catch (Exception e) 
        {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
    
}

