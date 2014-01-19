package by.pklochkov.cloudapp;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: pklochkov
 * Date: 19.01.14
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */
@javax.servlet.annotation.WebServlet(name = "DispatcherServlet")
public class DispatcherServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setAttribute("msg","Hello World");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
