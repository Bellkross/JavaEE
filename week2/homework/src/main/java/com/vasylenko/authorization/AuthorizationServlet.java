package com.vasylenko.authorization;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthorizationServlet extends HttpServlet {

    private final String mLogin = "Kyryll";
    private final String mPassword = "servletPass";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        try (PrintWriter out = resp.getWriter()) {
            if (login.equals(mLogin) && password.equals(mPassword)) {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>First servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Hello " + mLogin + "!</h1>");
                out.println("</body>");
                out.println("</html>");
            } else
                resp.sendError(403, "Illegal login and password");
        }
    }
}
