import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/servlet")
public class FirstServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        response.setContentType( "text/html" );
        response.getWriter().println( "<html><body>" );
        response.getWriter().println( "<h1>Welcome to my first JavaEE servlet</h1>" );
        response.getWriter().println( "</body></html>" );
    }

}
