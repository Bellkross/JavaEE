<%--
  Created by IntelliJ IDEA.
  User: bellkross
  Date: 20.01.2019
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
  </head>
  <body>
    <div align="center">
      <form action="authorization" method="post">
        Login: <input type="text" name="login" required="required">
        Password: <input type="password" name="password" required="required">
        <input type="submit" value="Sign in">
      </form>
    </div>
  </body>
</html>
