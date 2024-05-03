//describe & develop java servlet ,http request and response program.

//The request sent by the computer to a web server, contains all sorts of potentially interesting information; it is known as HTTP requests.
//The HTTP client sends the request to the server in the form of request message
//A servlet is a Java class that extends the 'javax.servlet.http.HttpServlet' class. It's responsible for handling HTTP requests and generating HTTP responses. 
//Java Servlets are the Java programs that run on the Java-enabled web server or application server. 
//They are used to handle the request obtained from the web server, process the request, produce the response, and then send a response back to the web server. 
//Servlets work on the server side.

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    {
        response.setContentType("text/html");
        String message = "Hello, world!";
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>" + message + "</h1>");
        response.getWriter().println("</body></html>");
    }
}
