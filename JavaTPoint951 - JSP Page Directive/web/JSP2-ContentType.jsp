<%-- 
    Document   : JSP-ContentType
    Created on : Mar 29, 2018, 1:11:55 AM
    Author     : omarhamdy
--%>
<%@page import="java.util.Date" contentType="text/html" pageEncoding="UTF-8"%>

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
        <h2 Style="color:red;">Before changing the content type notice the important link below you have to click back click this link</h2>
        <a href="JSP2-ContentTypePlainTxt.jsp"><h1> Change Content Type to palin text</h1></a> 
        <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Type" target="1"><h2>The Important Link</h2></a>

    </body>
</html>
