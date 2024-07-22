import java.util.*;
public class Treesetdemo {

	public static void main(String[] args)
	{
		SortedSet<String> courses=new TreeSet<>();
		
		courses.add("Java");
		courses.add("React");
		courses.add("Angular");
		courses.add("Cpp");
		courses.add("Python");
		courses.remove("Cpp");
		
		System.out.println(courses);
		System.out.println(courses.first());
		System.out.println(courses.last());

	}
}