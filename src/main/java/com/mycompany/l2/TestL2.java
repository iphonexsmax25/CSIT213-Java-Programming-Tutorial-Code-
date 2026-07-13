/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
import java.util.ArrayList;
import java.util.HashMap;

public class TestL2 {
     public static void main(String[] args){
         //testItem();
         //testArrayList();
         //testHashMap();
         testMgr();
     }
     public static void testMgr(){
         WarehouseMgr mgr = new WarehouseMgr("Bugis");
         System.out.println(mgr);
         // topup
         ArrayList<ShipmentItem> sItems = new ArrayList<>();
         sItems.add(new ShipmentItem("p1", 100));
         sItems.add(new ShipmentItem("p2", 200));
         mgr.topUp(sItems);
         System.out.println(mgr);
         // dispatch
         
     }
     public static void testHashMap(){
         HashMap<String, Integer> inventory = new HashMap<>();
         inventory.put("p1", 200);
         inventory.put("p2", 10);
         inventory.put("p1", 0);
         for(String code : inventory.keySet()){
             System.out.println(code + " " + inventory.get(code));
         }
     }
     public static void testArrayList(){
         ArrayList<ShipmentItem> sItems = new ArrayList<>();
         sItems.add(new ShipmentItem("p1", 100));
         sItems.add(new ShipmentItem("p2", 200));
         for ( int i = 0; i< sItems.size(); i++){
             System.out.println(sItems.get(i));
         }
         // for eachloop
         for (ShipmentItem oneItem : sItems){
             System.out.println(oneItem);
         }
         
     }
     public static void testItem(){
         ShipmentItem  sItem1 = new ShipmentItem("p1", 100);
         ShipmentItem  sItem2 = new ShipmentItem("p2", 200);
         ShipmentItem  sItem3 = new ShipmentItem("p2", 200);
         
         System.out.println(sItem1);
         System.out.println(sItem2);
         System.out.println(sItem1.equals(sItem2));
         System.out.println(sItem2.equals(sItem3));
         
         
         //REquest Item
         RequestItem rItem1 = new RequestItem("p1", 50);
         RequestItem rItem2 = new RequestItem("p2", 500);
         
         
         System.out.println(rItem1);
         System.out.println(rItem2);
         System.out.println(rItem1.equals(rItem2));
     }
    
}
