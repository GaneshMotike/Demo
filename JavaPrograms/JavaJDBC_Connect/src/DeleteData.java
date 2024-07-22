import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

	public class DeleteData {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter Id:");
		int id=sc.nextInt();		
						
		String url="jdbc:mysql://localhost:3306/mydb";
		String userid="root";
		String password="Ganesh@123";
		   try(Connection con=DriverManager.getConnection(url, userid, password))
			{
				String query="delete from products where id=?";
				PreparedStatement stmt=con.prepareStatement(query);
					
				  stmt.setInt(1, id);
					
				  int rowcount=stmt.executeUpdate();
					if(rowcount>0)
					{
						System.out.println("Deleted Successfully!");
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
