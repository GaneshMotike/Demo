public class NullpointerException {

	public static void main(String[] args) {
		
			try
			{
				System.out.println("-------Try-------");
				String s=null;
				System.out.println(s.length());
			}	
			catch(NullPointerException ex)
			{
				System.out.println("-------Catch-------");
				System.out.println("Value is Null");
			}
			catch(Exception ex)
			{
				System.out.println("-------Catch-------");
				ex.printStackTrace();
			}
			finally
			{
				System.out.println("-------Finally-------");
			}
		}
		

}
