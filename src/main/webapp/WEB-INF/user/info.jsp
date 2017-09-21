<%-- 
    Document   : info
    Created on : 2017-9-21, 14:59:13
    Author     : sihai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>userinfo</h1>
        <%= request.getRemoteUser() %>
    </body>
</html>
