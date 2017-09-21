<%-- 
    Document   : login
    Created on : 2017-9-21, 14:59:04
    Author     : sihai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="st" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>login</h1>
        <st:url value="/login" var="loginUrl" />
        <form method="POST" action="${loginUrl}">
            email:<input name="email" />
            password:<input type="password" name="password" />
            <input type="submit" value="登录" />
        </form>
    </body>
</html>
