import java.io.*;
public class WritingTextinFile
{
 public static void main(String[] args) throws IOException 
 {
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			FileWriter fw=new FileWriter(fpath);
			fw.write("This is Line-1\n");
			fw.write("This is Line-2\n");
			fw.write("This is Line-3\n");
			fw.write("This is Line-4");
			fw.close();
			System.out.println("Text printed Successfully!");
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}

	}

}
