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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[6];
        double promedio =0;
        for(int i=0; i<notas.length; i++){
            System.out.println("Ingrese la nota N°" + (i+1));
            notas[i] = sc.nextInt();
        }
        for(int i : notas){
            promedio += i;
        }
        promedio = promedio/notas.length;
        
        System.out.println("El promedio es: " + promedio);
    }
    
    if(promedio>=11){
            System.out.println("Aprobado");
        }else{
            System.out.println("Desaprobado");
        }
}
