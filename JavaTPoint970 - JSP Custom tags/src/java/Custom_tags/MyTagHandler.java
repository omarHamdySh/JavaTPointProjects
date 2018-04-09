/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom_tags;

import java.util.Calendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author omarhamdy
 */
public class MyTagHandler extends TagSupport {


    public int doStartTag() throws JspException {
        
            JspWriter out = pageContext.getOut();//returns the instance of JspWriter  
        
        try {
            out.print(Calendar.getInstance().getTime());//printing date and time using JspWriter  
        } catch (Exception e) {
            System.out.println(e);
        }
        return SKIP_BODY;//will not evaluate the body content of the tag  
    }
}
