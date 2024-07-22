class Parent
{
	public Parent()
	{
		System.out.println("Parent Class Empty Constructor Invoked");
	}
	public Parent(int i)
	{		
		System.out.println("Parent Class Parameterized Constructor Invoked");
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("Child Class Empty Constructor Invoked");
	}
	public Child(int i)
	{
		System.out.println("Child Class Parameterized Constructor Invoked");
	}
}
public class Constructordemo2 {

	public static void main(String[] args)
	{
//		Child c1=new Child();
		Child C2=new Child(15);
	}

}
