
public interface IArithematic
{
	
	public default void sum(int x, int y)
	{
		System.out.println(x+y);
		}

	public default void sub(int x, int y)
	{
		System.out.println(x-y);
		}
}