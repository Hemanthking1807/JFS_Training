<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Login page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="login.jsp" method="post">
            <input type="email" name="usermail" placeholder="Enter the Mail Id" required>
            <input type="password" name="userpass" placeholder="Enter the Password" required>
            <button type="submit" class="btn btn-dark btn-sm">submit</button>
            <button type="reset" class="btn btn-dark btn-sm">reset</button>
        </form>
        <a href="register.jsp">Register here</a>
    </body>
</html>