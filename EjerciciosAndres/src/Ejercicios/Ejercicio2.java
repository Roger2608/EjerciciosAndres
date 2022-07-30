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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        double ahorro = 0;
        while(count<13){
            System.out.println("Ingrese el ahorro del mes: " + count);
            count ++;
            ahorro += sc.nextDouble();
        }
        System.out.println("El ahorro del año es: " + ahorro);
    }
    
}
