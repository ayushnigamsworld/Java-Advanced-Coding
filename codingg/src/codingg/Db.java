package codingg;
import java.sql.*;
public class Db 
{
	public static void main(String[] args) 
	{
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("1");
		   Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ayush","nigam");
		   System.out.println("2");
		   Statement s=c.createStatement();
		   System.out.println("3");
		   ResultSet rs=s.executeQuery("select * from users");
		   System.out.println("4");
		   while(rs.next())
		   {
			   System.out.println("5");
			  System.out.println(rs.getFetchSize());
			  System.out.println(rs.getRow());
			  System.out.println(rs.getString(1));
			  System.out.println("6");
		   }
		   System.out.println("7");
	   }
	   catch(SQLException e)
	   {
		   System.out.println("error is"+e);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
}