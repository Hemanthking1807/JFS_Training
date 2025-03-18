package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Gmail ID:");
		String mail = sc.next();
		
		String query="SELECT gmail,pass FROM users WHERE gmail='"+mail+"';";
		String url="jdbc:mysql://localhost:3306/testdb";
		String user="root";
		String pass="root";
		
		try {
		Connection con=	DriverManager.getConnection(url,user,pass);
		System.out.println("connection done...");
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		if(rs.next()) {
			String passs = rs.getString("pass");
			System.out.println("Enter the Password:");
			String passw = sc.next();
			if(passw.equals(passs)) {
				System.out.println("Welcome Back " +mail);
			}
			else {
				System.out.println("Incorrect password");
			}
			
		}
		else {
			System.out.println("Gmail id not exists");
			}
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
}
