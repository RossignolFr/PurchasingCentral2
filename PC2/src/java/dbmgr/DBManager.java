package dbmgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bertrand
 */

public class DBManager {
    
    
    
    public DBManager() {
        
    }
    
    
    
    public Connection Connection(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            return DriverManager.getConnection(
                    "jdbc:derby://195.83.139.59:6027/sample4","app","app");
            
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    
    public Boolean Close(Connection connection){
        try{
            if(!(connection.isClosed())){
                connection.close();
            }
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }}
   
        
    }
    
    

