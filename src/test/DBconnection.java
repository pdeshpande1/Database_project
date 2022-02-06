package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		Statement stm= con.createStatement();
		ResultSet result =stm.executeQuery("Select * from eproduct");
		
		//Iterate through result set
		
		while(result.next())
		{
			//System.out.println(result.getInt("Id"));
			System.out.println(result.getString("name"));
		}
		
		con.close();
	}

}
