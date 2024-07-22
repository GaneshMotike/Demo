import java.util.*;
public class arraylist {
 public static void main(String[] args) {
		ArrayList<String> courselist=new ArrayList<>();
		
		courselist.add("C");
		courselist.add("C++");
		courselist.add("Java");
		courselist.add("Python");
		courselist.add("Java");
		
		courselist.remove(0);
		courselist.remove("Python");
		
		courselist.set(2, "Angular");
		for(int i=0;i<courselist.size();i++)
		{
			System.out.println(courselist.get(i));
		}

	}

}