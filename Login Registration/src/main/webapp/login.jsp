<%@ page import="java.sql.*" %>
    
<%
    String url = "jdbc:mysql://localhost:3306/projectdb";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "root", "root");
        out.println("Connection established success...");
        
        String usermail=request.getParameter("usermail");
        String userpass=request.getParameter("userpass");
        
        String query="SELECT * FROM users WHERE gmail=? AND userpass=?;";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, usermail);
        ps.setString(2, userpass);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        	session.setAttribute("userid",rs.getInt("userId"));
        	session.setAttribute("username",rs.getString("username"));
        	session.setAttribute("gmail",usermail);
        	session.setAttribute("userpass",userpass);

            response.sendRedirect("success.jsp");
        	
        	out.println("User found");
        	out.println("<a href='logout.jsp'>Logout</a>");

        	
        }
        else{
        	out.println("user not found");
        	out.println(" <a href='index.jsp'>Login</a>");

        }
    } catch (SQLException e) {
        out.println(e);
    }
%>