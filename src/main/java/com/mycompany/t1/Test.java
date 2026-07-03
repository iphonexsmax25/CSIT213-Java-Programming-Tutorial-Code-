/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1;

/**
 *
 * @author limis
 */
public class Test {
    public static void main(String[] argv){
        testItem();
        testArray();
        testInventory();
    }
    public static void testItem(){
        StoreItem item1 = new StoreItem("item1", "name 1", 1.5, 100);
        System.out.println(item1.getID());
        System.out.println(item1.getQty());
        System.out.println(item1);
    }
    public static void testArray(){
        StoreItem[] items =new StoreItem[3];
        System.out.println(items.length);
        System.out.println(items[0] == null);
    }
    public static void testInventory(){
        
    }
}
