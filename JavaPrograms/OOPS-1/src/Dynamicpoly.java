
class BankV1
{
	public void withdraw(int amount)
	{
		System.out.println("Withdraw using NetBanking");
	}
}
class BankV2 extends BankV1
 {
	@Override
	public void withdraw(int amount)
	{
		System.out.println("Withdraw using UPI");
	}
}
public class Dynamicpoly
{

	public static void main(String[] args)
	{
		BankV1 v1=new BankV1();
		v1.withdraw(5000);

		BankV2 v2=new BankV2();
		v2.withdraw(6500);
	}

}
