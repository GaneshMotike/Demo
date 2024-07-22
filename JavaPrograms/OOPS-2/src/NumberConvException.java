import java.util.Scanner;

public class NumberConvException {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("-------Try-------");
			System.out.println("Enter a Number:");
			int i=Integer.parseInt(sc.nextLine());
			i++;
			System.out.println(i);
		}
		catch(NumberFormatException ex)
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
