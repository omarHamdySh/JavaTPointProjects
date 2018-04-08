<%-- 
    Document   : sqltransaction
    Created on : Apr 8, 2018, 5:25:20 PM
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

        <sql:transaction dataSource="${db}" >
            <c:set var="EmpName" value="Jihan"/> 
            <sql:update var="count">  
                DELETE FROM Emp WHERE name=?  
                <sql:param value="${EmpName}" />  
            </sql:update> 
            <sql:update  var="count">  
                INSERT INTO Emp (name,password,email,country) VALUES ('Jihan', 'Jojo1212', 'Jojo@yahoo.com','Egypt');  
            </sql:update> 
        </sql:transaction>

        <sql:query dataSource="${db}" var="rs">  
            SELECT * from Emp;  
        </sql:query>  
        <table border="2" width="100%">  
            <tr>  
                <th>ID</th>  
                <th>Name</th>  
                <th>Password</th>  
                <th>Email</th>
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