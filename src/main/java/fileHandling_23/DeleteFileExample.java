package fileHandling_23;

import java.io.File;

public class DeleteFileExample 
{
    public static void main(String[] args) 
    {
        File file = new File("example.txt");

        if (file.delete()) 
        {
            System.out.println("File deleted successfully!");
        } 
        else 
        {
            System.out.println("Failed to delete the file.");
        }
    }
}
