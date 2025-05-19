package A_Interview_Prep;

public class ArrayLargeNumber
{
    public static void main(String[] args)
    {
        int [] arr = {20,56,97,600,2,1200,8000};
        int arrayLargeNum = arrayLargestElement(arr);
        System.out.println("The largest Element in the Array : " + arrayLargeNum);
    }

    public static int arrayLargestElement(int [] arr)
    {
        int max = arr[0];
        try
        {
            int i;
            for(i=1;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }
        } catch (Exception e)
        {
            System.out.println("Failed to find the largest element in the array");
        }
        return max;
    }
}
