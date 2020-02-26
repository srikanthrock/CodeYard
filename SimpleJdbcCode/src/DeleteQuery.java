import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","system","9010");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			int result=stmt.executeUpdate("delete from CUSTOMER1 where id=13");  
			System.out.println(result+" records affected");  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}

}
