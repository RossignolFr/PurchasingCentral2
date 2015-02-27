/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.faces.bean.RequestScoped;

import dbmgr.DBMgr_products;
import java.util.ArrayList;
import javabeans.PC_products;

/**
 * REST Web Service
 *
 * @author Bertrand
 */
@Path("mws")
@RequestScoped
public class MiddleWService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MiddleWService
     */
    public MiddleWService() {
    }

    /**
     * Retrieves representation of an instance of mws.MiddleWService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public WSPurchasingCentralResponse getAllProducts() {
        DBMgr_products dbmgr_products = new DBMgr_products();
        ArrayList<PC_products> list_prod = dbmgr_products.getAllProducts();
        WSPurchasingCentralResponse response = new WSPurchasingCentralResponse(0, "tout va bien", list_prod);
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of MiddleWService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
