
abstract class AArithematic
{
	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	public abstract void mul(int x,int y);
	public abstract void div(int x,int y);
}

 class demo extends AArithematic
    {

	@Override
	public void mul(int x, int y)
	{
		System.out.println(x*y);
		
	}

	@Override
	public void div(int x, int y)
	{
		System.out.println(x/y);
		
	}

		}
	
 public class Abstractclassdemo
  {
    public static void main(String[] args)
    {
		demo d1=new demo();
		d1.sum(2, 4);
		d1.sub(4, 2);
		d1.mul(2, 5);
		d1.div(5, 24);
	}

}
