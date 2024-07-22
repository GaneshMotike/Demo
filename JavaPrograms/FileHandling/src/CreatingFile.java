import java.io.File;
import java.io.IOException;
public class CreatingFile {

	public static void main(String[] args) throws IOException
	{
		String fpath="D:/sampleText.txt";
		
		File file=new File(fpath);
		file.createNewFile();
		
		if(file.exists())
		{
			System.out.println("File Created Successfully!");
		}
		else
		{
			System.out.println("Failed to Create File");
		}

	}

}
