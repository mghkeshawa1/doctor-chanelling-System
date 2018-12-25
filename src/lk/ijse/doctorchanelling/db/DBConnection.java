/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.db;

import java.sql.*;

/**
 *
 * @author infomatics
 */
public class DBConnection {
    
    private static DBConnection dBConnection;


    private Connection conn;
        
public DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Suwasetha","root","1234");
   
      

        
    }
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        if(dBConnection==null){
            dBConnection=new DBConnection();
            
        }
        return dBConnection;
    
    
    }
    public Connection getConnection(){
        return conn;
    }
      
}
