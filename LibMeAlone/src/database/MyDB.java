/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;

/**
 *
 * @author Zeus
 */
public class MyDB {
    public MyDB() {
        
    }
    
    public static Connection getConn() {
        String url = "jdbc:mysql://localhost/library";
        String username = "root";
        String password = "";
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        }
        catch(Exception e) {
            System.out.print(e);
            return null;
        }
    }
}
