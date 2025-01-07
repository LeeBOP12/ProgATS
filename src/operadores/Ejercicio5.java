/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio5 {
    /*
    La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos de su 
    rendimiento académico: participación, primer, segundo parcial y el examen final. Sabiendo que las calificaciones anteriores 
    entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la 
    calificación final obtenida por un estudiante
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float n1, n2,n3,n4, nf;
        
        System.out.println("==== NOTAS DE ESTUDAINTE ===");
        System.out.print("Nota participacion: ");
        n1 = Float.parseFloat(leer.nextLine());
        System.out.print("Primer Examen: ");
        n2 = Float.parseFloat(leer.nextLine());
        System.out.print("Segundo Examen ");
        n3 = Float.parseFloat(leer.nextLine());
        System.out.print("Examen Final ");
        n4 = Float.parseFloat(leer.nextLine());
        
        nf = (n1*0.1f)+ (n2*0.25f) + (n3*0.25f) + (n4*0.4f);
        
        System.out.println("\nNOTA FINAL: "+nf);
        leer.close();
    }
}
