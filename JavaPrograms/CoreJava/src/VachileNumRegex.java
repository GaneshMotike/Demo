import java.util.Scanner;

public class VachileNumRegex {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter vachile Number:");
		String number=sc.nextLine();
		
		if(number.matches("^[A-Za-z]{2}[0-9]{2}[A-Za-z]{2}[0-9]{4}$"))
		{
			System.out.println("Valid Input");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
