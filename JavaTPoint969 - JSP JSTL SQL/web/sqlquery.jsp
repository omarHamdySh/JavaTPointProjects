<%-- 
    Document   : sqlquery
    Created on : Apr 8, 2018, 4:36:31 PM
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
        <h2></h2>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                           url="jdbc:mysql://localhost:3306/HRDep"  
                           user="root"  password=""/>  
        <sql:query dataSource="${db}" var="rs">  
            SELECT * from Emp;  
        </sql:query>  
        <table border="2" width="100%">  
            <tr>  
                <th>Student ID</th>  
                <th>First Name</th>  
                <th>Last Name</th>  
                <th>Age</th>
                <th>Country</th>
            </tr>  
            <c:forEach var="table" items="${rs.rows}">  
                <tr>  
                    <td><c:out value="${table.id}"/></td>  
                    <td><c:out value="${table.name}"/></td>  
                    <td><c:out value="${table.password}"/></td>  
                    <td><c:out value="${table.Email}"/></td> 
                    <td><c:out value="${table.country}"/></td>  

                </tr>  
            </c:forEach>  
        </table>  
    </body>  
</html>  