<%-- 
    Document   : JSP-isThreadSafe
    Created on : Mar 29, 2018, 1:14:19 AM
    Author     : omarhamdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isThreadSafe="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The 8th JSP page directive "isThreadSafe"</h1>
        <h1>This attribute has a function almost identical with synchronized java keyword</h1>
        <h2>JavaTPoint:</h2>
        <h3>
Servlet and JSP both are multithreaded.If you want to control this behaviour of JSP page, you can use isThreadSafe attribute of page directive.The value of isThreadSafe value is true.If you make it false, the web container will serialize the multiple requests, i.e. it will wait until the JSP finishes responding to a request before passing another request to it.</h3>
        <h2>JSP API documentation:</h2>
        <h3>Indicates the level of thread safety implemented in the page. If false then the JSP container shall dispatch multiple outstanding client requests, one at a time, in the order they were received, to the page implementation for processing.
If true then the JSP container may choose to dispatch multiple outstanding client requests to the page simultaneously.
Page authors using true must ensure that they properly synchronize access to the shared state of the page. Default is true.
Note that even if the isThreadSafe attribute is false the JSP page author must ensure that accesses to any shared objects are properly synchronized., The objects may be shared in either the ServletContext or the HttpSession.</h3>
    </body>
</html>
