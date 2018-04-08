<%-- 
    Document   : sqlsetDataSource
    Created on : Apr 8, 2018, 4:26:40 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html>

<html>  
    <head>  
        <title>sql:setDataSource Tag</title>  
    </head>  
    <body>  
        <jsp:include page="Nav.html"/>
        <h2>Simply nothing will show up because this JSP page just connecting to the database :)</h2>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                           url="jdbc:mysql://localhost:3306/HRDep"  
                           user="root"  password=""/>  
    </body>  
</html>  