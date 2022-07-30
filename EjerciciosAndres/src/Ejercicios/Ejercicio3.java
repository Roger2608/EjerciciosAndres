/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author 15-AX222LA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        int numero = 0;
        while (valid != true) {
            System.out.println("Ingrese un valor entre el 100 y 200");
            numero = sc.nextInt();
            valid = (numero > 99 && numero < 201);
        }
        int count = 0;
        for (int i = 0; i <= numero; i += 5) {
            count = i;
            System.out.println(i);
        }
        if ((numero - count)> 0 && (numero - count) < 5) {
            System.out.println(numero);
        }
    }

}
