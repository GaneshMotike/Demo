import java.util.*;

public class ValidateUID {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UID:");
		String uid=sc.nextLine();
		if(Verhoeff.validateVerhoeff(uid))
		{
			System.out.println("Valid UID");
		}
		else
		{
			System.out.println("Invalid UID");
		}
		

	}

}

