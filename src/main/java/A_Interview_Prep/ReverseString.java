package A_Interview_Prep;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to Reverse : ");
        String input = scanner.nextLine();
        String revString = reverseTheString(input);
        System.out.println("The Reverse String is : " + revString);

    }

    public static String reverseTheString(String input) {
        String reverseString = "";
        try {
            char ch;
            for (int i = 0; i < input.length(); i++) {
                ch = input.charAt(i);
                reverseString = ch + reverseString;
            }
        } catch (Exception e) {
            System.out.println("Failed to Reverse the Input String");
            e.printStackTrace();
        }
        return reverseString;
    }
}
