/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author HP
 */
public class ConnectionDB {
    //URL, USER, PASSWD;
    
    public static final String URL = "jdbc:mysql://localhost:3306/ecoleete";
    public static final String USER = "root";
    public static final String PASSWD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWD);
    }
}
