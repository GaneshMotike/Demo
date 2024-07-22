import java.time.*;
public class DateTimeFunctions {

	public static void main(String[] args)
	{
	
//		LocalDateTime dt=LocalDateTime.of(1998, 4,15 , 14, 25, 25);
		LocalDateTime dt=LocalDateTime.now();
		
//		LocalDate  dt=LocalDate.now();
//		LocalTime dt=LocalTime.now();
		System.out.println(dt);
		System.out.println(dt.getYear());
		System.out.println(dt.getMonth());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println(dt.getNano());
		
		System.out.println(dt.getDayOfWeek());
		System.out.println(dt.getDayOfYear());
	}

}
