class Classv1
{
	public void show()
	{
		System.out.println("This is From V1");
	}
}
class Classv2 extends Classv1
{
	public void display()
	{
		System.out.println("This is From V2");
	}
}
class Classv3 extends Classv2
{
	public void print()
	{
		System.out.println("This is From V3");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
	
		Classv3 c3=new Classv3();
		c3.show();
		c3.display();
		c3.print();

	}

}

