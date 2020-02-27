/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.oca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Test7 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(15);
        arr.add(7);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(9);

        long valor =Test7.segment(3, arr);
        System.out.println("valor: "+valor);
    }

    @SuppressWarnings("empty-statement")
    public static int segment(int x, List<Integer> arr) {
        // Write your code here
        List<List<Integer>> grupos;
        grupos = new ArrayList<>();
        List<Integer> grupo;
        List<Integer> menores =new ArrayList<>();;
        for (int i = 0; i < arr.size(); i++) {
            grupo = new ArrayList<>();
            for (int j = 0; j < x; j++) {
                if ((i + j) < arr.size()) {
                    grupo.add(arr.get(i + j));
                }
            }
            if (grupo.size() == x) {
                grupo.sort(null);
                menores.add(grupo.get(0));
                grupos.add(grupo);
            }
        }
        System.out.println("grupos: "+grupos);
        menores.sort(null);
        return menores.get(menores.size()-1);
    }
}
