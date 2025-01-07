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
public class Ejercicio14 {
    /*
    Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000 USD
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        float sueldo, suma=0, contS=0;
        
        System.out.println("===== SUMA Y MAYORES SUELDOS ====");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sueldo "+(i+1)+": ");
            sueldo = Float.parseFloat(leer.nextLine());
            if (sueldo>1000) {
            contS++;
            }
            suma+=sueldo;
        }
        System.out.println("Suma de sueldos: "+suma);
        System.out.println("Sueldos mayores a 1000 USD: "+contS);
        leer.close();
    }
}
