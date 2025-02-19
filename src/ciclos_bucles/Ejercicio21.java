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
public class Ejercicio21 {
    /*
    Pedir 10 números y mostrar al final si se ha introducido alguno negativo
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int numero, indice=1;
        boolean negativos = false;
        System.out.println("=== NUMEROS NEGATIVOS ? ===");
        while (indice<=10) {            
            System.out.print("Numero "+indice+": ");
            numero = Integer.parseInt(leer.nextLine());
            indice++;
            if (numero<0) {
                negativos = true;
            }
        }
        if (negativos==true) {
            System.out.println("\n< HAY AL MENOS UN NUMERO NEGATIVOS >");
        } else {
            System.out.println("\n< NO HAY NINGUN NUMEOR NEGATIVO >");
        }
        leer.close();
    }
}
