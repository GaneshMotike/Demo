import java.io.*;
public class FileInfo 
{
	public static void main(String[] args)
	{
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
			System.out.println(file.length()+" Bytes");
			System.out.println(file.getPath());
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}

	}

}





