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
    private int qtyRequested, qtySupplied;
    public RequestItem(String pCode, int rQty){
        code = pCode;
        qtyRequested = rQty;
    }
    public String getCode(){
        return code; 
    } 
        
    public int getQtyRequested(){ 
        return qtyRequested; 
    }
    
    public void setQtySupplied(int sQty){
        if (sQty >= 0)
            qtySupplied = sQty;
    }
    
    public String toString() {
        return String.format(
          "RequestItem %s %d %d", code, qtyRequested, qtySupplied);
    }
    
    
    public boolean equals(Object other){
        if (other == null)
            return false;
        if (other instanceof RequestItem == false)
            return false;
        RequestItem temp = (RequestItem)other;
        return (code.equalsIgnoreCase(temp.code));
    }
}
