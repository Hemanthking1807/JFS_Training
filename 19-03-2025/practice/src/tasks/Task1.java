package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task1 {


	public static void main(String[] args) throws SQLException {
		
		
		try {
			Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
             System.out.println("Connected to DB...");
		
		while(true) {
			
		System.out.println("1.Registration");
		System.out.println("2.Edit Registration");
		System.out.println("3.Delete Registration");
		System.out.println("4.Show List");
		System.out.println("5.EXIT");
		System.out.println("Select Your Choice:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		 switch (x) {
         case 1 :
        	
        	 String query="INSERT INTO events (register_no,p_name, gmail, userpass,college,team) VALUES (?,?,?,?,?,?)";
        	 try {
        		 System.out.println("enter register number:");
            	 int reg1 = sc.nextInt();
            	 System.out.println("enter your name:");
                 String name1=sc.next();
                 System.out.println("enter gmail:");
                 String gmail1=sc.next();
                 System.out.println("enter password:");
                 String pass1=sc.next();
                 System.out.println("enter college name:");
                 String clg1=sc.next();
                 System.out.println("enter team name:");
                 String team1=sc.next();
     			Connection con1=	DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
    			PreparedStatement ps = con1.prepareStatement(query);
    			
    			ps.setInt(1,reg1);
    			ps.setString(2,name1);
    			ps.setString(3,gmail1);
    			ps.setString(4,pass1);
    			ps.setString(5,clg1);
    			ps.setString(6,team1);
    			ps.executeUpdate();
     			System.out.println("Registration is successful");
     			System.out.println("  ");
     		} 
        	 catch (SQLException e) {
 	            e.printStackTrace();
        	 }
        	 
        	 
        	 break;
         case 2 : 
        	 String query1 = "UPDATE events SET  register_no =?,p_name=?,gmail=?,userpass=?,college=?,team=? WHERE id= ?;";
     		
     		try {
     			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
     			
     			 System.out.println("enter ID number to edit:");
     			 int id=sc.nextInt();
     			 System.out.println("enter register number:");
            	 int reg1 = sc.nextInt();
            	 System.out.println("enter your name:");
                 String name1=sc.next();
                 System.out.println("enter gmail:");
                 String gmail1=sc.next();
                 System.out.println("enter password:");
                 String pass1=sc.next();
                 System.out.println("enter college name:");
                 String clg1=sc.next();
                 System.out.println("enter team name:");
                 String team1=sc.next();
     			
     			PreparedStatement ps = con1.prepareStatement(query1);
     			
     			ps.setInt(1,reg1);
    			ps.setString(2,name1);
    			ps.setString(3,gmail1);
    			ps.setString(4,pass1);
    			ps.setString(5,clg1);
    			ps.setString(6,team1);
    			
    			ps.setInt(7,id );
     			
     			int rows = ps.executeUpdate();
     			System.out.println(rows + " row Updated");
     			System.out.println("  ");
     		} 
     		catch (SQLException e) {
     			e.printStackTrace();
     		}
     		
     		
     		break;
        	 
         case 3 :	
        	 String query2= "DELETE FROM events WHERE id= ?;";
        	 System.out.println("enter your id to delete");
        	 int x1 = sc.nextInt();
 		
 		try {
 			Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
 			
 			PreparedStatement ps = con3.prepareStatement(query2);
 			ps.setInt(1,x1);
 			
 			int rows = ps.executeUpdate();
 			System.out.println(rows + " row Deleted");
 			System.out.println("  ");
 		}
 		 catch (SQLException e) {
	            e.printStackTrace();
     	 }
 		    
 		
 		  break;
         case 4:
        	 String query11 = "SELECT*FROM events;";
     		
     		try {
     			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root", "root");
     			System.out.println("Connection established success...");
     			
     			PreparedStatement ps = con1.prepareStatement(query11);
     			ResultSet rs=ps.executeQuery();
     			while(rs.next()) {
     				System.out.println(rs.getInt("Id")+" "+rs.getString("register_no")+" "+rs.getString("p_name")+" "+rs.getString("gmail")+" "+rs.getString("userpass")+" "+rs.getString("college")+" "+rs.getString("team"));
     				System.out.println("  ");
     			}	
     		} 
     		catch (SQLException e) {
     			e.printStackTrace();
     		}
        	
     		
     		
     		break; 
         case 5 : {
             System.out.println("Exiting...");
             return;
         }
		 }
		}
		}
          catch(SQLException e) {
	            e.printStackTrace();
	        }
}
		 
}
	
	
		
	

		
