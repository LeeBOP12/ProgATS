/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio7_1 {
    /*
    Pedir 3 numeros y mostrarlos ordenados de menor a mayor
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("=== ORDENAR NUMEROS DE MENOR A MAYOR ===");
        System.out.print("Numero A: ");
        n1 = Float.parseFloat(leer.nextLine());
        System.out.print("Numero B: ");
        n2 = Float.parseFloat(leer.nextLine());
        System.out.print("Numero C: ");
        n3 = Float.parseFloat(leer.nextLine());

        if (n1 <= n2 && n2 <= n3) { //n1 como el menor de todos
            System.out.println("Orden: " + n1 + " - " + n2 + " - " + n3);
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.println("Orden: " + n1 + " - " + n3 + " - " + n2);
        } else if (n2 <= n1 && n1 <= n3) { //n2 como menor de todos
            System.out.println("Orden: " + n2 + " - " + n1 + " - " + n3);
        } else if (n2 <= n3 && n3 <= n1) {
            System.out.println("Orden: " + n2 + " - " + n3 + " - " + n1);
        } else if (n3 <= n1 && n1 <= n2) { //n3 como menor de todos
            System.out.println("Orden: " + n3 + " - " + n1 + " - " + n2);
        } else {
            System.out.println("Orden: " + n3 + " - " + n2 + " - " + n1);
        }
    }
}
