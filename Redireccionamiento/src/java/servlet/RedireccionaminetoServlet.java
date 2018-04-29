package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RedireccionaminetoServlet", urlPatterns = {"/RedireccionaminetoServlet"})
public class RedireccionaminetoServlet extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String url = null;
        String tipoNavegador = request.getHeader("User-Agent");
        System.out.println("tipoNavegador" + tipoNavegador);
        if (tipoNavegador != null && tipoNavegador.contains("Trident")) {
            url = "http://www.microsoft.com";
        } else if (tipoNavegador != null && tipoNavegador.contains("Firefox")) {
            url = "http://www.firefox.com";
        } else if (tipoNavegador != null && tipoNavegador.contains("Chrome")) {
            url = "http://www.google.com";
        }

        response.sendRedirect(url);
    }
    
}
