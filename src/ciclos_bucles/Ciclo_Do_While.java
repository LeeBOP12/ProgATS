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
public class Ciclo_Do_While {
    /*
    -Minima cantidad de interacciones son 1
    -HACER las instrucciones MIENTRAS se cumpla la condicion
    -Usado para menus
    ------------------------------------------------------------
    do {
    INSTRUCCIONES;
    }while(CONDICION);
    */
    public static void main (String[] args){
        int i = 1;
        
        do {            
            System.out.println(i); //Se hace primreo la instruccion
            i++;
        } while (i<=10); //Luego se verifica
        
        Scanner leer = new Scanner(System.in);
        int num=1, contador;
        System.out.println("=== NUMEROS HASTA N ===");
        System.out.print("Numero hasta: ");
        contador = Integer.parseInt(leer.nextLine());
        do {            
            System.out.println(num);
            num++;
        } while (num<=contador);
    }
}
