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
public class Ejercicio4 {
    /*
    Pedir números hasta que se teclee uno negativo y mostrar cuantos números se han introducidos
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        float numero, cont=0;
        
        System.out.println("=== NUMEROS INTRODUCIDOS ===");
        System.out.print("Ingrese numero (no negativos): ");
        numero = Float.parseFloat(leer.nextLine());
        while (numero>=0) {
            cont++;
            System.out.print("Ingrese Numero: ");
            numero = Float.parseFloat(leer.nextLine());
        }
        System.out.println("Numeros Ingresados: "+cont);
        
        leer.close();
    }
}
