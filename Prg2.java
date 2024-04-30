// Servlet program for cookies
// index.html

/*
 * <form action="servlet1" method="post">
 * Name:<input type="text" name="userName"/><br/>
 * <input type="submit" value="go"/>
 * </form>
 */

//FirstServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n = request.getParameter("userName");
            out.print("Welcome " + n);

            Cookie ck = new Cookie("uname", n);// creating cookie object
            response.addCookie(ck);// adding cookie in the response

            // creating submit button
            out.print("<form action='servlet2'>");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// SecondServlet.java

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie ck[] = request.getCookies();
            out.print("Hello " + ck[0].getValue());

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

// web.xml
<web-app>  
  
<servlet>  
<servlet-name>s1</servlet-name>  
<servlet-class>FirstServlet</servlet-class>  
</servlet>  
  
<servlet-mapping>  
<servlet-name>s1</servlet-name>  
<url-pattern>/servlet1</url-pattern>  
</servlet-mapping>  
  
<servlet>  
<servlet-name>s2</servlet-name>  
<servlet-class>SecondServlet</servlet-class>  
</servlet>  
  
<servlet-mapping>  
<servlet-name>s2</servlet-name>  
<url-pattern>/servlet2</url-pattern>  
</servlet-mapping>  
  
</web-app>  
