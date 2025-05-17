package fileHandling_23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample 
{
    public static void main(String[] args) 
    {
        String fileName = "example.txt";
        String content = "\nThis is an appended line.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) 
        {
            bw.write(content);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
