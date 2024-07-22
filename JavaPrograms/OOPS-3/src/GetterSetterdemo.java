class Employee
{
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class GetterSetterdemo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("John");
		emp.setAge(25);
		
		System.out.println(emp.getId()+"\n"+emp.getName()+"\n"+emp.getAge());

	}

}
