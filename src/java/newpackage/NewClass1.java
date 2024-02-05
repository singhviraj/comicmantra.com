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
          
              out.println("<form action=\"./web\" method=\"post\">\n" +


"    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n" +
"\n" +

"    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n" +
"\n" +
"    <button type=\"submit\">Login</button>\n" +

"</form>");
              
    }
}
