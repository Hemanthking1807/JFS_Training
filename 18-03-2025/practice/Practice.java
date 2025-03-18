package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args) {
		
	String query="SELECT gmail,pass FROM users;";
	String url="jdbc:mysql://localhost:3306/testdb";
	String user="root";
	String pass="root";
	
	try {
	Connection con=	DriverManager.getConnection(url,user,pass);
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery(query);
	
	
	
	while(rs.next()==true) {
	   
	String mail=rs.getString("gmail");
	String pas =rs.getString("pass");
	System.out.println(" "+mail+" "+pas);
	}
	
	} 
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	

	}

}
