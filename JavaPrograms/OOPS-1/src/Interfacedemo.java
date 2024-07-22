class Sample implements IArithematic
{	
	public void sum(int x, int y)
{
	System.out.println(x+y);
	}

   public void sub(int x, int y)
{
	System.out.println(x-y);
	}
}

public class Interfacedemo {

	public static void main(String[] args) {
		IArithematic s1=new Sample();
		s1.sum(10, 20);
		s1.sub(10, 20);

	}

}

