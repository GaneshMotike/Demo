import java.util.*;
public class ArrayindexoutofboundsExec {

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("-------Try-------");
			String[] courses= {"C","C++","SQL","Angular","React"};
			System.out.println("Enter Index:");
			int i=sc.nextInt();
			System.out.println(courses[i]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("-------Catch-------");
			System.out.println("Incorrect Index Received!");
		}
		catch(Exception ex)
		{
			System.out.println("-------Catch-------");
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("-------Finally-------");
		}

	}

}
