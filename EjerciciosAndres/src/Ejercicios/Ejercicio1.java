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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montoTotal = 0;
        final double descuentoCondicional = 0.15;
        final int precioCondicional = 1000;
        final double igv= 0.18;
        double montoIgv=0;
        System.out.println("*-*-*- Ingrese el precio unitario -*-*-*");
        double precioUnitario = sc.nextDouble();
        System.out.println("*-*-*- Ingrese la cantidad -*-*-*");
        int cantidad = sc.nextInt();
        sc.close();
        double precioConjunto = precioUnitario * cantidad;
        if(precioConjunto > precioCondicional){
            precioConjunto = precioConjunto - (precioConjunto * descuentoCondicional);
        }
        
        montoIgv = precioConjunto * igv;
        
        montoTotal = precioConjunto + montoIgv;
        
        System.out.println("El igv es: " + montoIgv);
        System.out.println("El monto total es: " + montoTotal);
        
    }
    
}
