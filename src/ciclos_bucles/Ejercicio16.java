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
public class Ejercicio16 {
    /*
    Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int numero;  
        
        System.out.println("==== TABLA DE MULTIPLICAR DE 'N' ===");
        System.out.print("Indique numero: ");
        numero = Integer.parseInt(leer.nextLine());
        
        for (int i = 12; i>=1; i--) {
            if (numero>=0 && numero<=10) {
                System.out.println(numero+" x  "+i+" = "+(numero*i));
            }else{
                System.out.println("\n< NUMERO NO DENTRO DEL RANGO [0-10]");
                break;
            }
        }
    }
}
