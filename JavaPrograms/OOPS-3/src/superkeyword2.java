class Parent1
{
	public String msg="Good Evening";

	public Parent1(int i) {
		super();
		System.out.println("Parent Constructor Invoked!");
	}
	
}
class Child1 extends Parent1
{	
	
	public Child1() {
		super(50);	
		System.out.println("Child Constructor Invoked!");
	}

	public void getParentMsg()
	{
		System.out.println(super.msg);
	}
}
public class superkeyword2 {

	public static void main(String[] args) {
			Child1 c1=new Child1();
		c1.getParentMsg();

	}

}
