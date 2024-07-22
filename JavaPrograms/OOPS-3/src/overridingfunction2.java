import java.util.Objects;

class Product1
{
	public int id;
	public String name;
	public double price;
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		Product1 prod=(Product1)obj;
		if(prod.id==id && prod.name==name)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class overridingfunction2 {

	public static void main(String[] args)
	{
		Product1 p1=new Product1();
		p1.id=1;
		p1.name="Dell 3958";
		p1.price=36500;
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		
		Product1 p2=new Product1();
		p2.id=1;
		p2.name="Dell 3958";
		p2.price=42000;
		System.out.println(p2.toString());
		System.out.println(p2.hashCode());
		
		if(p1.equals(p2)) {
			System.out.println("Both Are Equal!");
		}
		else
		{
			System.out.println("Both Are NotEqual!");
		}

	}

}
