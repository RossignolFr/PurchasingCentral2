/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmgr;

/**
 *
 * @author Bertrand
 */
import java.sql.Connection;
import java.util.ArrayList;
import javabeans.PC_products;
import java.sql.ResultSet;

public class DBMgr_products {
    
    private DBManager db = new DBManager();
    
    public ArrayList<PC_products> getAllProducts(){
        ArrayList<PC_products> products = new ArrayList<PC_products>();
        String query = "SELECT * FROM APP.PC_PRODUCTS";
        try{
            Connection connection = db.Connection();
            ResultSet res = connection.createStatement().executeQuery(query);
            
            while(res.next()){
                PC_products prod = new PC_products();
                System.out.print("resultat req :"+res.getString("PRODUCT_REF"));
                //Get data from the row
                prod.setProductId(res.getInt("PRODUCT_ID"));
                prod.setProductStatutId(res.getInt("PRODUCT_STATUT_ID"));
                prod.setProductRef(res.getString("PRODUCT_REF"));
                prod.setProductLot(res.getString("PRODUCT_LOT"));
                prod.setProductUid(res.getString("PRODUCT_UID"));
                prod.setProductPrice(res.getDouble("PRODUCT_PRICE"));
                products.add(prod);
            }
            
            connection.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return products;
    }
    
    
}
