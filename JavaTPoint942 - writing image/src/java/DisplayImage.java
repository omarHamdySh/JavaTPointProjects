
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayImage extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        ServletOutputStream out;
        out = response.getOutputStream();
        //Change the path accordingly.
        FileInputStream fin = new FileInputStream("/Users/omarhamdy/Desktop/aqsa.jpg");

        //Read Byte Stream that was input using file input stream, because its faster to read.
        BufferedInputStream bin = new BufferedInputStream(fin);

        //Encapsulate the ServletOutPutStream inside BufferedOutPutStream because its faster
        //to write.
        BufferedOutputStream bout = new BufferedOutputStream(out);

        int ch = 0;
        //while statement will be used to check if their remaining bytes at the stream to write.
        while ((ch = bin.read()) != -1) {
        //at each loop, get the byte code current value and write it in the ServletOutPutStream Object.
            bout.write(ch);
        }

        bin.close();
        fin.close();
        bout.close();
        out.close();
    }
}
