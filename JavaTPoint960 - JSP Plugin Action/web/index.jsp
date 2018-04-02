<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>JSP Plugin action Demo</title>
    </head>
    <body>
        <h2>Please See the example tips first</h2>
        <h3><a href="http://www.w3processing.com/">JSP plugin action example tips</a></h3>
        <h4 style="color:red"> you have first to enable Applet in your browser</h4>
        <h4 style="color:red"> Google Chrome browser doesn't support applet anymore for security</h4>
        <jsp:plugin
            type="applet"
            code="app.InfoJApplet.class"
            codebase="/JavaTPoint960 - JSP Plugin Action/build/web/"
            jreversion="1.8"
            archive="PluginActionApplet.jar"
            >
            <jsp:params>
                <jsp:param name="firstName" 
                           value="James" />
                <jsp:param name="lastName" 
                           value="Bond" />
            </jsp:params>
            <jsp:fallback>
                <p>Could not load the applet!</p>
            </jsp:fallback>
        </jsp:plugin>

    </body>
</html>