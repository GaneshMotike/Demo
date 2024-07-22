class Parent
{
	public String msg="Good Evening";
}
class Child extends Parent
{
	public void getParentMsg()
	{
		System.out.println(super.msg);
	}
}
public class superkeyword1 
{

	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.getParentMsg();

	}

}
