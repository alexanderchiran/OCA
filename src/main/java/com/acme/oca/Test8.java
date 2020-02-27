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
public class Test8 {
    
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(13);
        arr.add(2);
        arr.add(5);
        arr.add(54);
        arr.add(55);
        arr.add(56);
        arr.add(6);
        arr.add(58);
        arr.add(3);
        arr.add(4);
        
        
        int valor = Test8.maxTickets(arr);
        System.out.println("valor: " + valor);
    }
    
    static int maxTickets(List<Integer> tickets) {
        tickets.sort(null);
        List<List<Integer>> grupos = new ArrayList<>();
        List<Integer> grupo;
        int salto = 0;
        for (int i = 0; i < tickets.size(); i++) {
            grupo = new ArrayList<>();
            grupo.add(tickets.get(salto));
            for (int j = salto; j < tickets.size(); j++) {
                
                if ((j + 1) < tickets.size()) {
                    int valor1 = tickets.get(j);
                    int valor2 = tickets.get(j + 1);
                    if (valor1 == valor2 || valor1 == (valor2 - 1)) {
                        grupo.add(valor2);
                    } else if (salto < tickets.size()) {
                        salto = j + 1;
                        break;
                    }
                    
                }
            }
            if (!grupos.contains(grupo)) {
                grupos.add(grupo);
            }
        }
        System.out.println(grupos);
        int max=0;
        for(List<Integer> x:grupos){
            if(x.size()>max){
                max=x.size();
            }
        }
        return max;
    }
}
