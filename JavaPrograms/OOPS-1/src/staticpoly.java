
class Arithematic
{
	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public void sum(double x,double y)
	{
		System.out.println(x+y);
	}
}
   public class staticpoly {

	public static void main(String[] args) {
		Arithematic ar=new Arithematic();
		ar.sum(10, 20);
		ar.sum(10,20, 35);
		ar.sum(15.25, 26.25);

	}

}
