/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.oca;

/**
 *
 * @author Alexander Chiran
 */
public class Test10 {

    public static void main(String[] args) {
        String arg = "Hello";
        change(arg);
        System.err.println(arg);
    }

    static void change(String s) {
        s = s.concat("valor");
    }

}
