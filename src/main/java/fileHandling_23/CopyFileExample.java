package fileHandling_23;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileExample 
{
    public static void main(String[] args) 
    {
        File sourceFile = new File("example.txt");
        File destFile = new File("example_copy.txt");

        try 
        {
            Files.copy(sourceFile.toPath(), destFile.toPath());
            System.out.println("File copied successfully!");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
