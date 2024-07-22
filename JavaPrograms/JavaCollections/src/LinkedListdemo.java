import java.util.*;
public class LinkedListdemo
{
	public static void main(String[] args)
	{
		LinkedList<String> courseList=new LinkedList<>();
		
		courseList.add("C");
		courseList.add("C++");
		courseList.add("Java");
		courseList.add("SQL");
		courseList.add("React");
		courseList.add("Vue");
		
		courseList.add(0,"Angular");
		courseList.remove("SQL");
//		courseList.remove(1);
		
		System.out.println(courseList);
	}
}

		