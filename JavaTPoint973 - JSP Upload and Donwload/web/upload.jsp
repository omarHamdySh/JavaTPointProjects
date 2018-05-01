<%-- 
    Document   : upload
    Created on : Apr 11, 2018, 11:06:54 PM
    Author     : omarhamdy
--%>

<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.util.Collection"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="com.oreilly.servlet.MultipartRequest" %>  
        <%
            MultipartRequest m = new MultipartRequest(request, "/Users/omarhamdy/Desktop");
            
            out.print("successfully uploaded");


        %>   
        <a href="download.jsp" >
            Download file
        </a>
    </body>
</html>
