package A_Interview_Prep;

//Write the program code the sort the given array elements in the ascending order

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] arr= {100,50,20,15,2,25,66,89,10};
        arrayAscendingSort(arr);
    }

    public static void arrayAscendingSort(int[] arr) {
        try {
            int i, j;
            for (i = 0; i < arr.length; i++) {
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Array after sorting in the ascending order");
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }

    }
}
