import java.util.*;
public class HashMapDemo 
{
	public static void main(String[] args) {
		Map<Integer,String> courselist=new HashMap<>();
		
		courselist.put(101, "Python");
		courselist.put(101, "Java");
		courselist.put(102, "Java");
		courselist.put(103, "React");
		courselist.put(104, "Angular");
		courselist.replace(101,"Azure");
		
		System.out.println(courselist);
		System.out.println(courselist.get(103));
		
		for(Map.Entry<Integer, String> course:courselist.entrySet())
		{
			System.out.println(course.getKey()+"-"+course.getValue());
		}

	}
}
