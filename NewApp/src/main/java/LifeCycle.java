import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {



    public void init() throws ServletException {
        System.out.println(" Here Init is called");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method called");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2> Hey from inside</h2>");

    }

    public void destroy() {
        System.out.println(" Here Destroy is called");
    }
}
