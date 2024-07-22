import java.util.Scanner;

public class UserIdRegex {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UserId:");
		String number=sc.nextLine();
		
		if(number.matches("^[A-Za-z]{1}[A-Za-z0-9_.]{7,19}$"))
		{
			System.out.println("Valid Input");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
