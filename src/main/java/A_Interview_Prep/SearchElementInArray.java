package A_Interview_Prep;

public class SearchElementInArray
{

    public static void main(String[] args)
    {
        int [] arr = {75, 25, 100, 325, 26, 400, 255};
        int elementToSearch = 325;
        boolean searchResult = searchElementInArray(arr, elementToSearch);
        System.out.println("The element to search in the Array is : " + searchResult);

    }

    public static boolean searchElementInArray(int [] arr, int element)
    {
        boolean searchElementStatus = false;
        try
        {
            int arrayLen = arr.length;
            for(int i=0; i<arrayLen ; i++)
            {
                if(arr[i] == element)
                {
                 searchElementStatus = true;
                }
            }

        } catch (Exception e)
        {
            System.out.println("Search Element not found in the Array" + e);
        }
        return searchElementStatus;
    }
}
