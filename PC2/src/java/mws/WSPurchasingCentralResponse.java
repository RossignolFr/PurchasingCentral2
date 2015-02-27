/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mws;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bertrand
 */
public class WSPurchasingCentralResponse implements Serializable {
    
    private String message; 
    private int errorcode; 
    private ArrayList produits;
    
    public WSPurchasingCentralResponse(int newerrorcode, String newmessage, ArrayList hello){
        this.message = newmessage; 
        this.errorcode = newerrorcode; 
        this.produits = hello; 
    }
    
    public WSPurchasingCentralResponse(){
        message = ""; 
        errorcode = 0;
        produits = new ArrayList(); 
    }
    
    
    public void setProduit(int newprice, int newIdProduit,int newQuantity, int newLot){
       //produits.add(new Produit(newprice,newIdProduit,newQuantity,newLot)); 
    }

    
}
