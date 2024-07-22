import java.util.*;
class Product
{
	private int id;
	private String name;
	private double price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	
	
}
public class listdemo {

	public static List<Product> products=new ArrayList<>();
	static {
		products.add(new Product(1,"Dell 3652",39500));
		products.add(new Product(2,"Lenovo G50-80",46500));
		products.add(new Product(3,"Apple MacBook Air",99000));
		products.add(new Product(4,"Iphone 15",68000));
		products.add(new Product(5,"Iphone 13 Mini",39000));
	}
	public static void main(String[] args) {
		for(Product prod:products)
		{
			System.out.println(prod);
		}

	}

}
