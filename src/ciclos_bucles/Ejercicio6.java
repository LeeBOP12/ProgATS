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
public class Ejercicio6 {
    /*
    Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num, suma=0;
        
        System.out.println("=== SUMA DE NUMEROS ===");
        do {            
            System.out.print("Digite numero:  ");
            num = Integer.parseInt(leer.nextLine());
            suma+= num;
        } while (num!=0);
        
        System.out.println("\nSuma de numeros: "+suma);
        leer.close();
    }
}
