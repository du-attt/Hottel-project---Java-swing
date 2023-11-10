 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class JDBCUtil {
    public static Connection getConnection(){
        Connection c =null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mySQL://localhost:3306/qlks_java";
            String username = "root";
            String password = "";
            c = DriverManager.getConnection(url, username, password);  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return c;
    }
    public static void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
