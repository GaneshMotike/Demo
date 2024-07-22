import java.util.*;
public class Hashsetdemo 
{
	public static void main(String[] args)
	{
		HashSet<String> courses=new HashSet<>();
		
		courses.add("C");
		courses.add("C++");
		courses.add("C++");
		courses.add("Java");
		courses.add("SQL");
		
		courses.remove("C");
		
		System.out.println(courses);

	}

}