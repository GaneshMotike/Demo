import java.util.*;
public class Queuedemo 
{
	public static void main(String[] args)
	{
		Queue<String> courses=new LinkedList<>();
		
		courses.offer("C");
		courses.offer("C++");
		courses.offer("SQL");
		courses.offer("Java");
		
		
		courses.add("Azure");
		courses.offer("python");
		
		courses.poll();
		
		System.out.println(courses);

	}

}