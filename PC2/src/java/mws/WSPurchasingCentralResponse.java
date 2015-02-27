/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mws;

import java.io.Serializable;
import java.util.ArrayList;

import javabeans.PC_products;
/**
 *
 * @author Bertrand
 */
public class WSPurchasingCentralResponse implements Serializable {
    
    public int errorcode; 
    public String message; 
    public ArrayList<PC_products> produits;
    
    public WSPurchasingCentralResponse(int newerrorcode, String newmessage, ArrayList<PC_products> hello){
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
