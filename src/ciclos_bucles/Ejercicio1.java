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
public class Ejercicio1 {
    /*
    Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num, cuadrado;
        System.out.println("=== CUADRADOS DE UN NUMERO + ===");
        System.out.print("Indique numero: ");
        num = Integer.parseInt(leer.nextLine());
        while (num>=0) {            
            cuadrado = (int) Math.pow(num, 2);
            System.out.println("Cuadrado del numero: "+cuadrado);
            System.out.print("Digiteo otro numero: ");
            num = Integer.parseInt(leer.nextLine());
        }
    }
}
