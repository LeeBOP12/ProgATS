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
public class Bucle_FOR {
    /*
    -Mas rapido que el WHILE y DO WHILE
    ---------------------------------------
    
    for (inicializa; condicion; incremento/decremento){
          INSTRUCCIONES;
    }
    */
    public static void main (String[] args){
        for (int i=10; i>=1; i--){
            //inicia, condicion, incrementa
            System.out.println(i);
        }
        
        Scanner leer = new Scanner(System.in);
        int contador;
        System.out.println("=== NUMEROS HASTA N ===");
        System.out.print("Numero hasta: ");
        contador = Integer.parseInt(leer.nextLine());
        
        for (int i = 1; i<=contador; i++){
            System.out.println(i);
        }
    }
}
