<%--
  Created by IntelliJ IDEA.
  User: efsam
  Date: 2/9/2021
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter</title>

</head>
<body id="back">
<div class="container">
    <form action="login" method="post" >
        <label> UserName :
            <input name="userName" type="text" placeholder="Enter your username" required>
        </label><br>
        <label>  Password :
            <input name="password" type="password" placeholder="Enter your password" required>
        </label><br>
        <input id="butt" type="submit" value="Login">
    </form>
</div>
</body>
</html>
