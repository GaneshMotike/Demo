class Employee
{
	public Employee()    //normal constructor
	{
		System.out.println("Empty Constructor Invoked!");
	}
	
	public Employee(String str)   //parameterised constructor
	{
		System.out.println("Parameterised Constructor Invoked!");
	}
}
public class Constructordemo
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee("india");

	}

}


