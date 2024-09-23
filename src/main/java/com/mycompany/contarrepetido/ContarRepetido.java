/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarrepetido;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class ContarRepetido {

    public static void main(String[] args) {
        int numerosVector[] = new int [15], numeroRepetido = 3, contadorRepetido=0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < numerosVector.length; i++) {
            System.out.println("Ingrese el valor de la posicion: "+i);
            numerosVector[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < numerosVector.length; i++) {
            if (numerosVector[i] == numeroRepetido) {
                contadorRepetido++;
            }
        }
        
        if (contadorRepetido == 1) {
            System.out.println("El numero "+numeroRepetido+" se cargo "+contadorRepetido+" vez");
        }else{
            System.out.println("El numero "+numeroRepetido+" se cargo "+contadorRepetido+" veces");
        }
    }
}
