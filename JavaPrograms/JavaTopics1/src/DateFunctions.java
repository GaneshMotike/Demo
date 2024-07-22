import java.util.*;

public class DateFunctions {

	public static void main(String[] args) 
	{
		Date dt=new Date();
		System.out.println(dt);
		System.out.println(1900+dt.getYear());
		System.out.println(dt.getMonth()+1);
		System.out.println(dt.getDate());
		System.out.println(dt.getHours());
		System.out.println(dt.getMinutes());
		System.out.println(dt.getSeconds());
		System.out.println(dt.getTime());
		System.out.println(dt.getTimezoneOffset());
		System.out.println(dt.getDay());

	}

}

