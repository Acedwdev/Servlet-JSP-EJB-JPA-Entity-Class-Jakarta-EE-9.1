
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logins List</title>
    </head>
    <body>
        <h1>Logins List</h1>
        <ul>
            <c:forEach items="${logins}" var="login">
                <li>${login.username} ${login.password}</li>
            </c:forEach>
        </ul>
    </body>
</html>
