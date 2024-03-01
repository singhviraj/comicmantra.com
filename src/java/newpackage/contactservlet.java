/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "contactservlet", urlPatterns = {"/contactservlet"})
public class contactservlet extends HttpServlet{
   // @Override
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
         response.setContentType("text/html");
          String userName = request.getParameter("userName"); 
        String yourEmailID = request.getParameter("yourEmailID"); 
        String yourPassword = request.getParameter("yourPassword"); 
        String gender = request.getParameter("gender"); 
        
        System.out.println("gender.." + gender); 
      
        
        if (userName != null && yourEmailID != null &&  yourPassword != null ) { 
            
            HttpSession httpSession = request.getSession(); 
            httpSession.setAttribute("emailId", yourEmailID); 
            httpSession.setAttribute("gender", gender); 
            
        }      

    }

}
