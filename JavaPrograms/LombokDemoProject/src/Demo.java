import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Product
{
	private int id;
	private String name;
	private double price;
}
public class Demo {

	public static void main(String[] args)
	{
		Product pr=new Product();
		pr.setId(1);
		pr.setName("Iphone 14");
		pr.setPrice(75000);
		System.out.println(pr.toString());

	}

}
