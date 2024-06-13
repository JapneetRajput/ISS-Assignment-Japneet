<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-box {
            width: 300px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .login-box h1 {
            text-align: center;
        }
        .form input {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
        }
        .submit-button {
            display: inline-block;
            padding: 10px 20px;
            margin: 5px 0;
            cursor: pointer;
            background-color: #007bff;
            color: white;
            text-align: center;
            border: none;
            border-radius: 5px;
            text-decoration: none;
        }
        .submit-button span {
            display: none;
        }
        .submit-button:hover {
            background-color: #0056b3;
        }
        .login-status {
            color: white;
            text-align: center;
            display: block;
            margin-top: 10px;
        }
    </style>
    <script>
        function validateLoginForm() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            var errorMessage = "";

            if (username.trim() === "") {
                errorMessage += "Username is required.\n";
                alert(errorMessage);
                return false;
            }

            if (password.trim() === "") {
                errorMessage += "Password is required.\n";
                alert(errorMessage);
                return false;
            }

            if (errorMessage !== "") {
                alert(errorMessage);
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div class="login-box">
    <h1>Login</h1>
    <form action="login" method="post" onsubmit="return validateLoginForm()">
        <div class='form'>
            <input
                    type="text"
                    placeholder="Username"
                    id="username"
                    name="username"
            /><br/><br/>
            <input
                    type="password"
                    placeholder="Password"
                    id="password"
                    name="password"
            /><br/><br/>
            <input type="submit" value="Login" class="submit-button">
        </div>
    </form>
    <br/><br/>
    <span>New user? Click <a href='register.jsp'>here</a></span>
    <c:if test="${not empty errorMessage}">
        <p style="color:red;">${errorMessage}</p>
    </c:if>
</div>
<c:if test="${not empty loginStatus}">
    <span class="login-status">${loginStatus}</span>
</c:if>
</body>
</html>
