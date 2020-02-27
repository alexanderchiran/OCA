/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.oca;

/**
 *
 * @author Alexander Chiran
 * 
 * Indica la respuesta correcta:

A. La clase no compilará

B. La clase compilará, pero se producirá un error al intentar ejecutarla

C. La clase compilará y mostrará "Método 2" al ejecutarla

D. La clase compilará y se ejecutará correctamente, pero no mostrará nada
 * 
 * 
 */
public class Test11 {

    public static void main(String n) {
        System.out.println("Método 1");
    }

    public static void main(String[] n) {
        System.out.println("Método 2");
    }

    public static int main() {
        System.out.println("Método 3");
        return 0;
    }

}
