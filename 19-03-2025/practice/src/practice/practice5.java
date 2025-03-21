package practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class practice5 {

	public static void main(String[] args) {
		String query = "SELECT*FROM users;";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
			System.out.println("Connection established success...");
			
			java.sql.Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			ResultSetMetaData	meta=rs.getMetaData();
			System.out.println(meta.getColumnCount());
			System.out.println(meta.getColumnName(2));
			System.out.println(meta.getColumnTypeName(2));
			System.out.println(meta.getTableName(2));
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}