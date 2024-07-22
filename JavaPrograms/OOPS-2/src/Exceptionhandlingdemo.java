import java.util.*;
public class Exceptionhandlingdemo {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("-------Try-------");
			System.out.println("Enter a Number:");
			int i=sc.nextInt();			
			i++;
			System.out.println("After Increment:"+i);
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

