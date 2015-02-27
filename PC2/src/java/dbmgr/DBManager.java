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
    
    private Connection connection;
    
    
    public DBManager() {
        
    }
    
    
    
    private Boolean Connection(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(
                    "jdbc:derby://195.83.139.59:6027/sample4","app","app");
            return true;
            
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
    
    private Boolean Close(){
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
    public ResultSet executeQuery(String query){
        ResultSet result = null;
        try{
            this.Connection();
            result = connection.createStatement().executeQuery(query);
            this.Close();
            return result;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    
    
}
