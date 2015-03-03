package no.javabin.gradledemo.web;

import no.javabin.gradledemo.service.AddService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addServlet", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

    private AddService addService = new AddService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int result = addService.add(a, b);

        PrintWriter out = response.getWriter();
        out.println(String.format("%d + %d = %d", a, b, result));
        out.close();
    }
}