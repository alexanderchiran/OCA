/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Test6 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(7);

        long contador = Test6.kSub(3, nums);

        System.out.println("Resultado: " + contador);
    }

    public static long kSub(int k, List<Integer> nums) {

        long contador = 0;
        try {
            List<String> combinacion = new ArrayList<>();
            // Write your code here

            //System.out.println("n: " + n);
            int r = nums.size();
            for (int n = 1; n <= nums.size(); n++) {
                Combinacion(nums, "", n, r, combinacion);
            }
            System.out.println(combinacion);

            for (String valores : combinacion) {
                String[] arreglo = valores.split(",");

                int suma = 0;
                for (String valor : arreglo) {
                    suma = suma + Integer.parseInt(valor);
                }
                if (suma % k == 0) {
                    contador++;
                }
            }

        } catch (NumberFormatException e) {
            return contador;
        }
        return contador;
    }

    private static void Combinacion(List<Integer> nums, String iteracion, int n, int r, List<String> combinacion) {
        if (n == 0) {
            String[] arreglo = iteracion.split(",");
            List<String> numsArreglo = Arrays.asList(arreglo);
            numsArreglo.sort(null);
            String concatena = "";
            for (String c : numsArreglo) {
                concatena = concatena + c + ",";
            }
            if (!combinacion.contains(concatena)) {
                combinacion.add(concatena);
            }
        } else {
            for (int i = 0; i < r; i++) {
                if (!iteracion.contains(nums.get(i).toString())) {
                    Combinacion(nums, iteracion + nums.get(i) + ",", n - 1, r, combinacion);
                }
            }
        }
    }

}
