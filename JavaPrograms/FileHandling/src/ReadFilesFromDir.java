import java.io.*;

public class ReadFilesFromDir
{
	public static void main(String[] args)
	{
		String dirPath="D:/Java/FileHandling/01FEB24/";
		File dir=new File(dirPath);
		File[] filelist=dir.listFiles();
		for(File f:filelist)
		{
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.length()+" Bytes");
			System.out.println("-------------------");
		}

	}

}