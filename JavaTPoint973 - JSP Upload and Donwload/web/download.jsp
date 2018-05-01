<%-- 
    Document   : download
    Created on : Apr 11, 2018, 11:20:40 PM
    Author     : omarhamdy
--%>

<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String filename = "aqsa.jpg";
            String filepath = "/Users/omarhamdy/Desktop/";
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(filepath + filename);

            int i;
            while ((i = fileInputStream.read()) != -1) {
                out.write(i);
            }
            fileInputStream.close();
        %>     
    </body>
</html>
