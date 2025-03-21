package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class practice1 {

	public static void main(String[] args) {
		String query = "INSERT INTO users (username, gmail, userpass) VALUES (?, ?, ?);";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
			System.out.println("Connection established success...");
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,"king");
			ps.setString(2,"king@gmail.com");
			ps.setString(3,"king@123");
			
			int rows = ps.executeUpdate();
			System.out.println(rows + " row(s) affected");			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}