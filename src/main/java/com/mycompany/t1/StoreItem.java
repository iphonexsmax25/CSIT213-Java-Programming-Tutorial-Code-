/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1;

/**
 *
 * @author limis
 */
public class StoreItem {
    private String id;
    private String name; 
    private double price;
    private  int qty; 
    
    public StoreItem(String pID, String pName, double pPrice, int pQty){
        id = pID;
        name = pName;
        qty = pQty; 
    }
}
