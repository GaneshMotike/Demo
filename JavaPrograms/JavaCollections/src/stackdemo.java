import java.util.*;
public class stackdemo 
{
	public static void main(String[] args)
	{
		Stack<Integer> scorelist=new Stack<>();
		
		scorelist.push(10);
		scorelist.push(20);
		scorelist.push(30);
		scorelist.push(40);
		scorelist.push(50);
		
		
//		scorelist.pop();
//		scorelist.pop();
		
	
		System.out.println(scorelist);
		
		for(int i:scorelist)
	      {
			System.out.println(i);
		  }
	}

}