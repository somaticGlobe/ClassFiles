package murach.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class CurrencyFormatTag extends TagSupport 
{
    private double value;
    public void setValue(double v)
    {
        this.value = v;
    }
    
    StringWriter sw = new StringWriter();
    
    @Override
    public int doStartTag()throws JspException
    {
        NumberFormat nform = NumberFormat.getCurrencyInstance(Locale.US);
        try
        {
            JspWriter out = pageContext.getOut();
            out.println(nform.format(value));
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        
        return SKIP_BODY;
        
    }
}
