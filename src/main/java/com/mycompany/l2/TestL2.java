/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;

/**
 *
 * @author limis
 */
public class TestL2 {
     public static void main(String[] args){
         testItem();
     }
     public static void testItem(){
         ShipmentItem  sItem1 = new ShipmentItem("p1", 100);
         ShipmentItem  sItem2 = new ShipmentItem("p2", 200);
         ShipmentItem  sItem3 = new ShipmentItem("p2", 200);
         
         System.out.println(sItem1);
         System.out.println(sItem2);
         System.out.println(sItem1.equals(sItem2));
         System.out.println(sItem2.equals(sItem3));
     }
    
}
