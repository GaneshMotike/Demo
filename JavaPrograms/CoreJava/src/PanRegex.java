import java.util.Scanner;

public class PanRegex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a PAN No:");
		String number=sc.nextLine();
		
		if(number.matches("^[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}$"))
		{
			System.out.println("Valid Input");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	 }

	}


