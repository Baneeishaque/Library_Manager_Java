/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Arya G Mohan
 */
public class DbConnect {
    
   
        Connection con=null;
        
    public static Connection db()
    {
        try {   
 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
             Statement stmt=(Statement) con.createStatement();
             //JOptionPane.showMessageDialog(null, "Connection successfull");
             return con;
        }
     catch (ClassNotFoundException | SQLException e) {
         JOptionPane.showMessageDialog(null, e);
         return null;
       }

    }
    
}
