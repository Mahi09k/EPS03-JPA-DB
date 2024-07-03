package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.EmployeeEntity;
import com.model.RemoteEmployee;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @EJB
    RemoteEmployee re;

    public EmployeeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        try {
            int eid = Integer.parseInt(request.getParameter("eid"));
            String ename = request.getParameter("ename");
            double esal = Double.parseDouble(request.getParameter("esal"));
            
            EmployeeEntity E = new EmployeeEntity();
            E.setEid(eid);
            E.setEname(ename);
            E.setEsal(esal);
            
            String result = re.insert(E);
            pw.print(result);
        } catch (NumberFormatException e) {
            pw.print("Error: Invalid input format.");
        } catch (Exception e) {
            pw.print("Error: " + e.getMessage());
        } finally {
            pw.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
