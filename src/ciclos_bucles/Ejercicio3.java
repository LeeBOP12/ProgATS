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
public class Ejercicio3 {
    /*
    Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar
    */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.println("==== NUMERO PAR, IMPAR ===");
        System.out.print("Indique numero: ");
        numero = Integer.parseInt(leer.nextLine());
        while(numero!=0){
            if (numero%2==0) {
                System.out.println("ES PAR");
            } else {
                System.out.println("ES IMPAR");
            }
            System.out.print("Indique nuevo numero: ");
            numero = Integer.parseInt(leer.nextLine());
        }
        leer.close();
    }
}
