/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
/**
 *
 * @author lenovo
 */
//public class NewClass  extends GenericServlet{
public class NewClass  extends HttpServlet{
   // @Override
  //  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    //            res.setContentType("text/html");
      //          PrintWriter out = res.getWriter();
        //        out.println("<h1>working<h1/>");
  //  }
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
         res.setContentType("text/html");
               PrintWriter out = res.getWriter();
              out.println("<h1>working<h1/>");
              String name = req.getParameter("cars");
              out.println(name);
              String name1 = req.getParameter(name);
              out.println(name1);
    }
}
