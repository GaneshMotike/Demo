import java.io.*;

public class CreateDirectory
{
	public static void main(String[] args) {
		String dirPath="D:/Java/FileHandling/01FEB24/";
		File file=new File(dirPath);		
		file.mkdirs();
		if(file.exists())
		{
			System.out.println("Folder(s) Created Successfully!");
		}
		else
		{
			System.out.println("Something Went Wrong!");
		}

	}

}