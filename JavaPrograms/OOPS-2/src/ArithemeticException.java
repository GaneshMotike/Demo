import java.util.*;

public class ArithemeticException {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("-------Try-------");
			
			System.out.println("Enter a Number:");
			int a=sc.nextInt();	
			
			System.out.println("Enter a Number:");
			int b=sc.nextInt();
			int result=a/b;
			System.out.println("Result:"+result);
		}	
		catch(ArithmeticException ex)
		{
			System.out.println("-------Catch-------");
			System.out.println("You Can't Divide a number with Zero");
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
