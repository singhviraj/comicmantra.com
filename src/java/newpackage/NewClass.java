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
            //  out.println("<h1>working<h1/>");
             boolean b = false;
              String full="";
              String user = req.getParameter("uname");
              String pass = req.getParameter("pname");
              String name = req.getParameter("full");
              if(pass.equals("bang")){
                   out.println(name);
              }
              else{
                 out.println("<h1> Kindly enter the connect credentials</h1");
                 out.println("<h1> If you do not have a password yet , kindly get it from the"
                         + "nearby francise along with your library card. </h1");
              }
         /*     Cookie[] cookies = req.getCookies();
              if(cookies == null){
                  out.println("You need to login first");
                  return;
              }
              else{
                  
                  for(Cookie c : cookies){
                       
                      String temp = c.getName();
                      if(temp.equals("fullname")){
                          full = c.getValue();
                          b = true;
                      }
                  }
              }
              
              
                  if(b){
                  out.println("<h1>"+full+"</h1>");
              }
              
              
           //   String name = req.getParameter("cars");
            //  out.println(name);
            //  String name1 = req.getParameter(name);
            //  out.println(name1);  */
       
    }
}
