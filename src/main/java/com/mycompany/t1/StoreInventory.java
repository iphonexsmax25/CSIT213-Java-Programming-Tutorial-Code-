/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1;

/**
 *
 * @author limis
 */
public class StoreInventory {
    private String branch;
    
    public StoreInventory(String bName){
        branch = bName;
    }
    public String getBranch(){
        return branch;
    }
    public boolean addItem(StoreItem anItem){
        return false;
    }
    public boolean delItem(String itemID){
        return false;
    }
    public String toString(){
        return "";
    }
}
