<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .welcome-box, .auth-box {
            width: 300px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            text-align: center;
        }
        .welcome-box h2, .auth-box h2 {
            margin-bottom: 20px;
        }
        .welcome-box form, .auth-box a {
            margin-top: 20px;
            display: block;
        }
        .welcome-box input[type="submit"], .auth-box a {
            padding: 10px 20px;
            cursor: pointer;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            display: inline-block;
            margin: 10px;
        }
        .welcome-box input[type="submit"]:hover, .auth-box a:hover {
            background-color: #0056b3;
        }
    </style>
    <script>
        window.onload = function() {
            const params = new URLSearchParams(window.location.search);
            if (params.has('unauthorized')) {
                alert("You're not authorized to go on the welcome page.");
            }
        }
    </script>
</head>
<body>
<%
    Boolean isLoggedIn = (Boolean) request.getAttribute("isLoggedIn");
    if (isLoggedIn != null && isLoggedIn) {
        String username = (String) request.getAttribute("username");
%>
<div class="welcome-box">
    <h2>Welcome, <%= username %></h2>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</div>
<%
} else {
%>
<div class="auth-box">
    <h2>Welcome to the Web Application</h2>
    <a href="login.jsp">Login</a>
    <a href="register.jsp">Register</a>
</div>
<%
    }
%>
</body>
</html>
