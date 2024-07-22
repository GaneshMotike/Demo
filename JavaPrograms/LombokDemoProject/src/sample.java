import lombok.*;
@Setter
@Getter
@ToString
class student
{
	private int id;
	private  String name;	
}
public class sample {

	public static void main(String[] args)
	{
		student std=new student();
		std.setId(1);
		std.setName("ganesh");
		System.out.println(std.toString());

	}

}
