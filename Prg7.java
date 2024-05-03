//Create a Servlet program for cookies

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie-demo")
public class CookieDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie1 = new Cookie("username", "john_doe");
        cookie1.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie1);
        Cookie cookie2 = new Cookie("theme", "dark");
        cookie2.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie2);
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Cookies Set</h1>");
        response.getWriter().println("<p>Two cookies have been set.</p>");
        response.getWriter().println("</body></html>");
    }
}
