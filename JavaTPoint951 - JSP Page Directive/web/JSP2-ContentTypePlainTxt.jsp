<%-- 
    Document   : JSP2-ContentTypePlainTxt
    Created on : Mar 29, 2018, 3:07:56 AM
    Author     : omarhamdy
--%>

<%@page import="java.util.Date" contentType="text/plain" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP2 - ContentType Page</title>
    </head>
    <body>
        <h1>The second directive "ContentType"</h1>
        <h3>we'd used "contentType= text/plain" at the JSP page tag
            </br>its suppose to run successfully, as plain text file inside the browser</h3>
        Today: <%= new Date().toString()%>
        <%! Date date1 = new Date();%>

        <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Type" target="1"><h2>Please Click Here</h2></a>

    </body>
</html>