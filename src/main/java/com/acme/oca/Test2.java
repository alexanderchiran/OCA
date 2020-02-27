/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.oca;

/**
 *
 * @author @author Alexander Chiran
 */
import java.util.ArrayList;
import java.util.List;
 
public class Test2 {
     public static void main(String[] args) {
         String s = "Hello";
         List<String> list = new ArrayList<>();
         list.add(s);
         list.add("Hello");
         list.add(s);
         s.replace("l", "Lii");
 
         System.out.println(list);
     }
}
