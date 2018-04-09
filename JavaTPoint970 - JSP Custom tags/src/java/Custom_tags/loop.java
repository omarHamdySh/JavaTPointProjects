/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom_tags;


import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.tagext.TagSupport;  
  
public class loop extends TagSupport{  
    private int start=0;  
    private int end=0;  
      
    public void setStart(int start) {  
        this.start = start;  
    }  
    public void setEnd(int end) {  
        this.end = end;  
    }  
      
    @Override  
    public int doStartTag() throws JspException {  
        return EVAL_BODY_INCLUDE;  
    }  
  
    @Override  
    public int doAfterBody() throws JspException {  
        if(start<end){  
            start++;  
            return EVAL_BODY_AGAIN;  
        }else{  
        return SKIP_BODY;  
       }  
          
    }  
  
   
}
