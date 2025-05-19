package A_Interview_Prep;

public class StringReverse {
    public static void main(String[] args) {
        String str = "BHOGALGAON";
        String reverseStr = reverseTheString(str);
        System.out.println(reverseStr);
    }

    public static String reverseTheString(String str) {
        String rev = " ";
        try {
            int len = str.length();
            for (int i = len - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
        } catch (Exception e) {
            System.out.println("Failed to reverse the given String");
            e.getMessage();
        }
        return rev;
    }
}
