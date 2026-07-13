/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class RequestItem {
    private String code;
    private int qtyRequested;
    private int qtySupplied;
    
    public RequestItem(String xCode, int rQty){
        code = xCode;
        qtyRequested = rQty;
    }
    public String getCode(){
        return code;
    }
    public int getQtyRequested(){
        return qtyRequested;
    }
    public void setQtyRequested(int sQty){
        if(sQty >= 0){
            qtySupplied = sQty;
        }
    }
    public String toString(){
        return String.format("", code, qtyRequested, qtySupplied);
    }
    
            
}
