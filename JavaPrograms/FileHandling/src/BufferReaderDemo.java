import java.io.*;
public class BufferReaderDemo
{
	public static void main(String[] args) throws IOException {
		String fpath="D:/sampleText.txt";
		File file=new File(fpath);
		if(file.exists())
		{
			BufferedReader br=new BufferedReader(new FileReader(fpath));
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		else
		{
			System.out.println("Incorrect File Path!");
		}


	}

}
