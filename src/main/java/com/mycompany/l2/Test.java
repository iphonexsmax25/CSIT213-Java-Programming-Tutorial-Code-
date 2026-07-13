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

public class Test {
    public static void main(String[] argv){
        testItem();
        testArrayList();
        testHashMap();
        testMgr();
    }
    public static void testMgr(){
        WarehouseMgr mgr = new WarehouseMgr("Bugis");
        System.out.println(mgr);
        // topUp
        ArrayList<ShipmentItem> sItems = new ArrayList<>(); 
        sItems.add(new ShipmentItem("p1", 100));
        sItems.add(new ShipmentItem("p2", 200));
        mgr.topUp(sItems);
        System.out.println(mgr);
        // dispatch
        ArrayList<RequestItem> rItems = new ArrayList<>();
        rItems.add(new RequestItem("p1", 90));
        rItems.add(new RequestItem("p2", 300));
        mgr.dispatch(rItems);
        System.out.println(mgr);
        // Verify ArrayList<RequestItem>
        for (RequestItem oneItem : rItems){
            System.out.println(oneItem);
        }
    }
    public static void testHashMap(){
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("p1", 200);
        inventory.put("p2", 10);
        inventory.put("p1", 0);
        for (String code: inventory.keySet()){
            System.out.println(code + " " + inventory.get(code));
        }
    }
    public static void testArrayList(){
        ArrayList<ShipmentItem> sItems = new ArrayList<>(); 
        sItems.add(new ShipmentItem("p1", 100));
        sItems.add(new ShipmentItem("p2", 200));
        for (int i = 0; i < sItems.size(); i++){
            System.out.println(sItems.get(i));
        }
        // for each loop
        for (ShipmentItem oneItem : sItems){
            System.out.println(oneItem);
        }
    }
    public static void testItem(){
        ShipmentItem sItem1 = new ShipmentItem("p1", 100);
        ShipmentItem sItem2 = new ShipmentItem("p2", 200);
        ShipmentItem sItem3 = new ShipmentItem("p2", 200);
        System.out.println(sItem1);
        System.out.println(sItem2);
        System.out.println(sItem1.equals(sItem2));
        System.out.println(sItem2.equals(sItem3));
        // RequestItem
        RequestItem rItem1 = new RequestItem("p1", 50);
        RequestItem rItem2 = new RequestItem("p2", 500);
        System.out.println(rItem1);
        System.out.println(rItem2);
        System.out.println(rItem1.equals(rItem2));
    }
}
