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
public class Ejercicio10 {
    /*
    Pedir 10 números y escribir la suma total.
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int suma=0,num;
        System.out.println("=== SUMA DE 10 NUMEROS ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese Numero "+(i+1)+": ");
            num = Integer.parseInt(leer.nextLine());
            suma+=num;
        }
        System.out.println("\nResultado de Suma: "+suma);
        leer.close();
    }
}
