/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edwin
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("MÃ©todo doGet no soportado en el Servlet");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //Leemos los parametros del formulario
        //por default el formulario es de tipo Get
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");

        System.out.println("usuario:" + usuario);
        System.out.println("password:" + password);

        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("El parametro usuario es: " + usuario);
        out.println("<br>");
        out.println("El parametro password es: " + password);
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
