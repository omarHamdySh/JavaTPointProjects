<%-- 
    Document   : index.jsp
    Created on : Mar 26, 2018, 5:34:17 PM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to declaration tag example.</h1>
                
                <!--  Declaration tag -->
        <%! int i=5; int cube(int n){return n*n*n;} %>
        
                <!-- Expression tag -->
        <%=i +"</br>"+ "Cube of three is: "+cube(3)%>
    </body>
</html>
