package iterativeStatements_7;

import java.util.ArrayList;
import java.util.List;

public class ForEnhan_PrintList 
{
	
    public static void main(String[] args) 
    {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Orange");
        fruits.add("Papaya");

        for (String fruit : fruits) 
        {
            System.out.print(fruit+"\t");
        }
    }
    
}
