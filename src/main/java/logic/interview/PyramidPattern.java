package logic.interview;

public class PyramidPattern 
{
    public static void main(String[] args) 
    {
        int rows = 5; // Number of rows for the pyramid
        for (int i = 1; i <= rows; i++) //outer loop number of rows - forward loop
        {
            for (int j = rows; j > i; j--) //inner loop number of columns spaces backward loop
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) //inner loop number of columns stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
