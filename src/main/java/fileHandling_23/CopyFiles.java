package fileHandling_23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFiles 
{
	public static void main(String[] args) throws IOException 
	{
		Path sourcepath = Paths.get("C:\\data\\temp\\temp.txt");
		Path destinationepath = Paths.get("C:\\data\\temp\\destination.txt");
		Files.copy(sourcepath, destinationepath, StandardCopyOption.REPLACE_EXISTING);
		

	}

}
