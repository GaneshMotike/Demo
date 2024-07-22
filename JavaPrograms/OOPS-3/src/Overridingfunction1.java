class Product
{
	public int id;
	public String name;
	public double price;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class Overridingfunction1 {

	public static void main(String[] args)
	{
		Product p1=new Product();
		p1.id=1;
		p1.name="Dell 3958";
		p1.price=36500;
		System.out.println(p1.toString());

	}

}
