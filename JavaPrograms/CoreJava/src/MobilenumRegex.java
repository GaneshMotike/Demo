import java.util.*;
public class MobilenumRegex {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Mobile No:");
		String mobile=sc.nextLine();
		
		if(mobile.matches("^[6-9]{1}[0-9]{9}$"))
		{
			System.out.println("Valid Input");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
