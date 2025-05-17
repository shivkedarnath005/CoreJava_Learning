package arrayDemo_3;

import java.util.Arrays;

public class arraySortMethod
{
    public static void main(String[] args) 
    {
        // Define the array of numbers
        int[] numbers = {5, 2, 9, 1, 5, 6};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
