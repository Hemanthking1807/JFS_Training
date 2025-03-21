
<%
if(session.getAttribute("userid")!= null){
	out.println("welcome back "+session.getAttribute("username"));
}
else{
	out.println("Sessio Expired...");
}
%>
<a href="logout.jsp">Logout</a>