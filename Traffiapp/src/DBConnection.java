/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanzi
 */

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    
     public static Connection getConn (){
        
            String url = "jdbc:sqlite:Traffiapp.db";
            
            
            try {
               
            Driver driver= new org.sqlite.JDBC();
            
            DriverManager.registerDriver(driver);
            
            System.out.println("Driver for SQLite downloaded.");
            
                } catch (Exception e) {
                    System.out.println("Problem with download driver for SQLite: " + e.getMessage());
            }
            Connection connection = null;
            
            try {
            connection = DriverManager.getConnection(url);
            
            System.out.println("Connected to the database4");
            
            
                } catch (Exception e) {
                    System.out.println("Erroor connection to the database " + e.getMessage());
                }
          
             return connection;
         }
     
     
     
       public static void creatingTable () {
        Connection connection = DBConnection.getConn();
       
       
        String table = "CREATE TABLE if not exists User_Registration ("
                + " userID    INTEGER  PRIMARY KEY AUTOINCREMENT,"
                + " userFirstName  VARCHAR (50) NOT NULL,"
                + " userSurname  VARCHAR (50) NOT NULL,"
                + " userGender  VARCHAR (1) NOT NULL,"
                + " userEmail  VARCHAR (50) NOT NULL,"
                + " userTel  VARCHAR (50) NOT NULL,"
                + " userName  VARCHAR (50) NOT NULL,"
                + " userPassword  VARCHAR (50) NOT NULL" + ") ;";
              

        try {
            
            Statement sqlStatement =connection.createStatement();
            
            sqlStatement.executeUpdate(table);
            
            System.out.println("User_Registration table created!");
           
            } catch(Exception e) {
             System.out.println("Error creating User_Registration table");
        }
    }
    
}
