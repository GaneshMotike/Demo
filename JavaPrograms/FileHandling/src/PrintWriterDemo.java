import java.io.*;
public class PrintWriterDemo
{
	public static void main(String[] args) throws IOException 
	{
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			PrintWriter fw=new PrintWriter(fpath);
			fw.println("This is Line-1\n");
			fw.println("This is Line-2\n");
			fw.println("This is Line-3\n");
			fw.println("This is Line-4");
			fw.close();
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}

	}
}