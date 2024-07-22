import java.io.*;
import java.util.*;
public class ReadingScanner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())    //using hasNextLine
			{
				System.out.println(sc.nextLine());
			}
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}
	}

}