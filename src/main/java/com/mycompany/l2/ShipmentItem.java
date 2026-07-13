/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class ShipmentItem {
    private String code;
    private int qty;
    public ShipmentItem(String pCode, int pQty){
        code =pCode; 
        qty = pQty;
    }
    public String getCode(){
        return code;
    }
    public int getQty(){
        return qty;
    }
    public String toString(){
        return String.format(" ShipmentItem %s %d", code, qty);
    }
    public boolean equals(Object other){
        return false;
    }
    
}
