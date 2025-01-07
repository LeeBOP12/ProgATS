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
public class Ciclo_While {
    /*
    -Minima cantidad de interacciones 0
    -Se ejecuta las intrucciones MIENTRAS se cumpla la condicion
    -----------------------
    while (condicion){
    INSTRUCCIONES;
    }
    */
    public static void main (String[] args){
        int i=1;
        //Numeros del 1 -10
        while (i<=5) { //Verifica que cumpla
            System.out.println(i);
            i++; //Aumenta y vuelve la bucle
        }
        //Pedir hasta un limite
        Scanner leer = new Scanner(System.in);
        int num= 1, contador;
        System.out.println("=== NUMEROS HASTA N ===");
        System.out.print("Numeros hasta: ");
        contador = Integer.parseInt(leer.nextLine());
        
        while (num<=contador) {            
            System.out.println(num);
            num++;
        }
        
    }
}
