import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		String userid="root";
		String password="Ganesh@123";
		try(Connection con=DriverManager.getConnection(url, userid, password))
		{
			System.out.println("Connected to Database!");
		}
		catch(Exception ex)
		{
			System.out.println("Failed to Connect!");
			ex.printStackTrace();
		}


	}

}
