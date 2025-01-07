/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio9 {
    /*
    Escribir todos los números del 100 al 0 de 7 en 7
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("=== NUMEROS DE 7 EN 7 ===");
        for (int i = 100; i>=0; i-=7) {
            System.out.println(i);
        }
    }
}
