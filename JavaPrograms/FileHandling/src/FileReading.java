import java.io.*;
public class FileReading 
{
	public static void main(String[] args) throws IOException  {
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			FileReader reader=new FileReader(fpath);
			int character;
			while((character=reader.read())!=-1)
			{
				System.out.print((char)character);
			}
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}


	}

}