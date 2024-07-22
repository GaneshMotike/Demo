class Class1
{
	public void print()
	{
		System.out.println("This is From Class-1");
	}
}
class Class2 extends Class1
{
	public void show()
	{
		System.out.println("This is From Class-2");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Class1 c1=new Class1();
		c1.print();
		
		Class2 c2=new Class2();
		c2.show();
		c2.print();

	}

}

