import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.darwinsys.spdf.PDF;
import com.darwinsys.spdf.Page;
import com.darwinsys.spdf.Text;
import com.darwinsys.spdf.MoveTo;

public class ServletPDF extends HttpServlet {
        @Override
	public void service(HttpServletRequest request,
		HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("application/pdf");

		response.setHeader("Content-disposition","inline; filename='javatpoint.pdf'");

		PDF p = new PDF(out);
		Page p1 = new Page(p);

                p1.add(new MoveTo(p, 200, 500));
		p1.add(new Text(p, request.getParameter("website")));
		p1.add(new Text(p, request.getParameter("name")));
		
		p.add(p1);
		p.setAuthor(request.getParameter("auther"));
                
		p.writePDF();
                out.close();
	}
}
