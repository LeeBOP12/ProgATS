/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio8 {

    /*
    Pedir un número N y mostrar todos los números del 1 al N
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, inicio = 1;
        System.out.println("=== NUMEROS HASTA N ===");
        System.out.print("Digite N: ");
        num = Integer.parseInt(leer.nextLine());
        do {
            System.out.println(inicio);
            inicio++;
        } while (inicio <= num);
        leer.close();
    }
}
