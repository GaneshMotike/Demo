import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

	public class UpdateData {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				
				System.out.println("Enter Name:");
				String name=sc.next();
				
				System.out.println("Enter Price:");
				double price=sc.nextDouble();
				
				String url="jdbc:mysql://localhost:3306/mydb";
				String userid="root";
				String password="Ganesh@123";
				try(Connection con=DriverManager.getConnection(url, userid, password))
				{
					String query="update products set name=?,price=? where id=?";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setString(1, name);
					stmt.setDouble(2, price);
					stmt.setInt(3, id);
					
					
					int rowcount=stmt.executeUpdate();
					if(rowcount>0)
					{
						System.out.println("Updated Successfully!");
					}
					else
					{
						System.out.println("Failed to Update!");
					}
				}
				catch(Exception ex)
				{
					System.out.println("Failed to Connect!");
					ex.printStackTrace();
				}

			}

		}