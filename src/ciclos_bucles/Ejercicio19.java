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
public class Ejercicio19 {

    /*
    Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float nota;
        int aprobados = 0, condicionados = 0, supensos = 0;

        System.out.println("==== NOTAS DE ALUMNOS ====\nNOTA DE [ 0 - 10 ]");
        for (int i = 1; i <= 6; i++) {
            do {
                System.out.print("NOTA " + i + ": ");
                nota = Float.parseFloat(leer.nextLine());
            } while (nota < 0 || nota > 10);
            
            if (nota == 4) {
                condicionados++;
            } else if (nota < 4) {
                supensos++;
            } else {
                aprobados++;
            }
        }
        System.out.println("==== RESUMEN DE NOTAS ====");
        System.out.println("Alumnos aprobados : " + aprobados);
        System.out.println("Alumnos desaprobados: " + supensos);
        System.out.println("Alumnos codnicionados: " + condicionados);
    }
}
