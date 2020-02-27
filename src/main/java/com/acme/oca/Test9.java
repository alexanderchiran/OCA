/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.oca;

/**
 *
 * @author ASUS
 */
public class Test9 {
    
      public static void main(String[] args) {
           
        
        int valor = Test9.theFinalProblem("01011");
        System.out.println("valor: " + valor);
    }
    
    public static int theFinalProblem(String target) {
    // Write your code here
        char[] cero;
        cero = "0,0,0,0,0".toCharArray();
        char[] entra=target.toCharArray();
        int cont=0;
        for(int i=0;i<5;i++){
            if(cero[i]!=entra[0]){
              cont=5-i;  
              break;
            }
        }
        
        return cont;
    }
}
