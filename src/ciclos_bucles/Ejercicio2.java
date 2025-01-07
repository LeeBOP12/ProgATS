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
public class Ejercicio2 {
    /*
    Leer un numero e indicar si es positivo o negativo. El proceso se repetirá hasta que
    se introduzca un 0
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("=== NUMERO POSITIVO O NEGATIVO ===");
        System.out.print("Indique numero: ");
        num = leer.nextInt();
        while (num!=0){
            if (num>0) {
                System.out.println("< NUMERO POSITIVO >");
            } else {
                System.out.println("< NUMERO NEGATIVO >");
            }
            System.out.print("Indique numero: ");
            num = leer.nextInt();
        }
    }
}
