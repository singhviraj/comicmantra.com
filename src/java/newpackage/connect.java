/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;
import newpackage.NewClass2;
/**
 *
 * @author lenovo
 */
public class connect extends HttpServlet{
   // @Override
  
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
         res.setContentType("text/html");
               PrintWriter out = res.getWriter();
               String givenemail = req.getParameter("uname");
            //  out.println("<h1>working<h1/>");
          try{ 
     // String dbDriver = "com.mysql.cj.jdbc.Driver"; 
               
        String dbUsername = "comicmantra"; 
       String dbPassword = "comicmantra";
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        
       java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://d.cd0skuqq63pm.eu-north-1.rds.amazonaws.com:3306/d",dbUsername,dbPassword); 
    
      // out.println("<h1>"+con+"</h1>");
       //  if(con.isClosed()){
       //     out.println("<h1>fuck</h1>");
    //    }
    //    else{
    //      out.println("<h1>no fuck</h1>");
    //    }
      // Connection con = NewClass2.initializeDatabase(); 
       
      // String query ="create table t(temail varchar(20))";
      //Statement stmt = con.createStatement();
      //stmt.executeUpdate(query);
    //  String query="insert into t(temail) values(?)";
      //PreparedStatement pstmt = con.prepareStatement(query);
      //pstmt.setString(1, "sviraj");
    //  pstmt.executeUpdate();
    String query="select * from t";
    Statement stmt = con.createStatement();
    ResultSet set = stmt.executeQuery(query);
    String email="notfound";
    while(set.next()){
         email = set.getString(1);
         out.println("<h1>"+email+"</h1>");
        if( email.equals(givenemail)){
            
           RequestDispatcher rd = req.getRequestDispatcher("web");
           rd.forward(req,res);
            
        }
        email="notfound";
    }
    if(email.equals("notfound")){
        out.println("<h1>Kindly register your email first</h1>");
         
        RequestDispatcher rd = req.getRequestDispatcher("create.html");
           rd.forward(req,res);
            
    }
   
        
}
catch(Exception e){
    
}
              
    }}