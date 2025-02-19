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
public class Ejercicio22 {
    /*
    Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int cal;
        boolean suspensos = false;
        System.out.println("=== SUSPENSOS ? ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese nota "+i+": ");
            cal = Integer.parseInt(leer.nextLine());
            if (cal<=4) {
                suspensos = true;
            }
        }
        if (suspensos==true) {
            System.out.println("\n< HAY AL MENOS UN SUSPENSO >");
        } else {
            System.out.println("\n< NO HAY NINGUN SUSPENSO >");
        }
    }
}
