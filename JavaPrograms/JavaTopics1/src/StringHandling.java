
public class StringHandling {

	public static void main(String[] args) {
		String s="i am from INDIA";
		System.out.println(s);
		System.out.println(s+"(+91)");
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder("i am from INDIA");
		System.out.println(sb);
		System.out.println(sb.append("(+91)"));
		System.out.println(sb);
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("i"));
		System.out.println(s.endsWith("INDIA"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,8));
		System.out.println(s.replace('m', '#'));
		System.out.println(s.replace("INDIA", "CHENNAI"));
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('m'));
		System.out.println(s.lastIndexOf('m'));
		
		String ss1="i am from INDIA";
		String ss2="i am from india";
		
		System.out.println(ss1.compareTo(ss2));
		System.out.println(ss1.compareToIgnoreCase(ss2));
		
		System.out.println(ss1.equals(ss2));
		System.out.println(ss1.equalsIgnoreCase(ss2));
	}

}

