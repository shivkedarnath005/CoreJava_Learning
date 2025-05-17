package fileHandling_23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample 
{
    public static void main(String[] args) 
    {
        String fileName = "example.txt";
        String content = "Hello, this is an example of writing to a file in Java.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) 
        {
            bw.write(content);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
