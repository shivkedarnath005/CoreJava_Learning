package A_Interview_Prep;

import java.util.Arrays;

public class ArrayFindElement {
    public static void main(String[] args) {
        int[] arr = {55,90,10,25,36,78,13,57,73};
        int toCheckElement = 25;
        boolean elementCheck ;
        elementCheck = findArrayElement(arr, toCheckElement);
        System.out.println("The Element " + toCheckElement + " is present in Array " + elementCheck);
        System.out.println("Array : " + Arrays.toString(arr));
    }

    public static boolean findArrayElement(int[] arr, int toCheckElement) {
        boolean test = false;
        try {
            for (int ele : arr) {
                if (ele == toCheckElement) {
                    test = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Failed to find the element in the Array");
            e.getMessage();
        }
        return test;
    }
}
