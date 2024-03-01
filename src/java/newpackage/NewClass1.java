/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 *
 * @author lenovo
 */
public class NewClass1 extends HttpServlet{
     public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
         res.setContentType("text/html");
               PrintWriter out = res.getWriter();
          
             //  String name = req.getParameter("cars");
          //    out.println(name);
             // String name1 = req.getParameter(name);
            //  out.println(name1);
               out.println("<!DOCTYPE html>"); 
            out.println("<html>"); 
            out.println("<head>"); 
            out.println("<title>Servlet Servlet1</title>"); 
            out.println("</head>"); 
            out.println("<body>"); 
            String name = req.getParameter("genre");
            String name1 = req.getParameter(name);
          //  Cookie c = new Cookie("lorem",name1);
           // res.addCookie(c); 
             
          //  out.println("<form action=\"./connect\" method=\"post\">\n" +
   out.println("<form action=\"./connect\" method=\"post\">\n" +

"    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n" +
"\n" +
   "    <input type=\"hidden\" value=\""+name1+"\" name=\"full\" required>\n" +
"\n" +                   
                      

"    <input type=\"password\" placeholder=\"Enter Password\" name=\"pname\" required>\n" +
"\n" +
"    <button type=\"submit\">Login</button>\n") ;
             
                      
              out.println( "</form>");
               
              out.println("</body>"); 
            out.println("</html>"); 
              
              
    }
}
