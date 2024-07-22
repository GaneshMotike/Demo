import java.sql.*;
import java.util.*;
public class InsertData {
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
					String query="insert into products(id,name,price) values(?,?,?)";
					PreparedStatement stmt=con.prepareStatement(query);
					stmt.setInt(1, id);
					stmt.setString(2, name);
					stmt.setDouble(3, price);
					int rowcount=stmt.executeUpdate();
					if(rowcount>0)
					{
						System.out.println("Inserted Successfully!");
					}
					else
					{
						System.out.println("Failed to Insert!");
					}
				}
				catch(Exception ex)
				{
					System.out.println("Failed to Connect!");
					ex.printStackTrace();
				}

			}

		
	}
