/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

import java.util.ArrayList;
import java.util.HashMap;
public class WarehouseMgr {
    private String name;
    private HashMap<String, Integer> inventory;
    public WarehouseMgr(String wName){
        name = wName;
        inventory = new HashMap<>();
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(name + "\n");
        for (String code: inventory.keySet()){
            String codeQty = code + " " + inventory.get(code) + "\n";
            result.append(codeQty);
        }
        return result.toString();
    }
    public void topUp(ArrayList<ShipmentItem> items){
        for (ShipmentItem oneItem : items){
            if (oneItem != null){
                String code = oneItem.getCode();
                int qty = oneItem.getQty();
                if (inventory.containsKey(code)){
                    int qtyOnhand = inventory.get(code);
                    int totalQty = qty + qtyOnhand;
                    inventory.put(code, totalQty);
                }
                else{
                    inventory.put(code, qty);
                }
            }
        }
    }
    public void dispatch(ArrayList<RequestItem> items){
        for (RequestItem oneItem : items){
            if (oneItem != null){
                String code = oneItem.getCode();
                int qtyRequested = oneItem.getQtyRequested();
                if (inventory.containsKey(code)){
                    int qtyOnhand =  inventory.get(code);
                    if (qtyOnhand >= qtyRequested){
                        int balance = qtyOnhand - qtyRequested;
                        oneItem.setQtySupplied(qtyRequested);
                        inventory.put(code, balance);
                    }
                    else {
                        oneItem.setQtySupplied(qtyOnhand);
                        inventory.put(code, 0);
                    }
                }
            }
        }
    }
}

