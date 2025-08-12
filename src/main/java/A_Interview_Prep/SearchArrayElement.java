package A_Interview_Prep;

public class SearchArrayElement {
    public static void main(String[] args) {
        int[] arr = {167, 789, 347, 209, 271, 100, 56};
        int elementToSearch = 347;
        boolean searchResult = searchElementInArray(arr, elementToSearch);
        System.out.println("Search element in Array Result is : " + searchResult);

    }

    public static boolean searchElementInArray(int[] arr, int element) {
        boolean searchResultStatus = false;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    searchResultStatus = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Search Element not found in the Array " + e.getMessage());
        }
        return searchResultStatus;
    }
}
