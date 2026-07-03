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
    private static int MAX_ITEM = 100;
    private String branch;
    private StoreItem[] items;
    
    public StoreInventory(String bName){
        branch = bName;
        items = new StoreItem[MAX_ITEM];
    }
    public String getBranch(){
        return branch;
    }
    public boolean addItem(StoreItem anItem){
        if (anItem== null){
            return false;  
        }
         for (int i =0; i<items.length; i++){
             if (items[i] == null){
                 items[i]= anItem;
                 return true;
             }
         }
         return false; // No space in the array 
    }
    public boolean delItem(String itemID){
        return false;
    }
    public String toString(){
        return "";
    }
}
