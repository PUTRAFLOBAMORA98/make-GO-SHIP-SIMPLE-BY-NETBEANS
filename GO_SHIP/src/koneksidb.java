
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class koneksidb {
     public static Connection MYSQLCONFIG;
   
  public static Connection configDB() throws SQLException{
   
        try{
            String url = "jdbc:mysql://localhost:3306/goship";
             String user = "root";
            String pass= "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLCONFIG = DriverManager.getConnection(url, user, pass);
            
            
        }catch(SQLException e){
            System.out.println("Koneksi ke database gagal" + e.getMessage());
        }
        return MYSQLCONFIG;
}
}