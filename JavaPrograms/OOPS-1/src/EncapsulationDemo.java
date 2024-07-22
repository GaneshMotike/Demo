class Parent
{
	protected int a=15;
	public void print()
	{
		System.out.println(a);
		}
	}
	class Child extends Parent
	{
		int b=18;
	}
	public class EncapsulationDemo
 	{

		public static void main(String[] args) 
		{
			Parent p1=new Parent();
			Child c1=new Child();
		
			System.out.println(p1.a);
			p1.print();
			System.out.println(c1.a);

	}

}

