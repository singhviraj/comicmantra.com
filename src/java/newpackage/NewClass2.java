/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;


import java.sql.*;


/**
 *
 * @author lenovo
 */
public class NewClass2 {
    protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.cj.jdbc.Driver"; 
        //String dbURL = "jdbc:mysql://localhost:3306/d"; 
        // Database name to access 
         String dbURL = "jdbc:mysql://ec2-16-170-21-87.eu-north-1.compute.amazonaws.com:3306/d"; 
        String dbUsername = "comicmantra"; 
        String dbPassword = "comicmantra"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL, dbUsername,dbPassword); 
        return con; 
    } 
}
