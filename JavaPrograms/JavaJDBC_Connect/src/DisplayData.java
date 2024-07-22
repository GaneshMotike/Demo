import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

 public class DisplayData {
	public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/mydb";
			String userid="root";
			String password="Ganesh@123";
			try(Connection con=DriverManager.getConnection(url, userid, password))
			{
				String query="select * from products";
				PreparedStatement stmt=con.prepareStatement(query);
				ResultSet rs=stmt.executeQuery(); 
				while(rs.next())
				{
					System.out.print(rs.getInt("id"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getDouble("price"));
					System.out.println();
				}
			}
			
			catch(Exception ex)
			{
				System.out.println("Failed to Connect!");
				ex.printStackTrace();
			}

		}

	}
