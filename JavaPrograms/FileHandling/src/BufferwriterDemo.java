import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferwriterDemo {

	public static void main(String[] args) throws IOException {
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			BufferedWriter fw=new BufferedWriter(new FileWriter(fpath));
			fw.write("This is Line-1\n");
			fw.write("This is Line-2\n");
			fw.write("This is Line-3\n");
			fw.write("This is Line-4");
		
			fw.close();
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}

	}

}