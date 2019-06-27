/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tharindi
 */
public class DBConnection {
   private static Connection connection;
   private static DBConnection dbConnection;
   
   private DBConnection() throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql://localhost/javacrud","root","ijse");
   }
   
   private static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
       if(dbConnection == null){
           dbConnection = new DBConnection();
       }
       return dbConnection;
   }
   
   public static Connection getConnection() throws ClassNotFoundException, SQLException{

       DBConnection dbCon =getDBConnection();
       return dbCon.connection;
   }
   
}
