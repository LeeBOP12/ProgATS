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
public class Ejercicio2 {
    /*
    Hacer un programa que calcule e imprima el salario semanal de un empleado 
    a partir de sus horas semanales trabajadas y de su salario por hoja.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float horas, salarioH, salarioS;
        System.out.println("=== SALARIO SEMANAL ===");
        System.out.print("Horas trabajadas: ");
        horas = Float.parseFloat(leer.nextLine());
        System.out.print("Salario por hora: ");
        salarioH = Float.parseFloat(leer.nextLine());
       
        salarioS = salarioH*horas;
        
        System.out.println("\nSALARIO SEMANAL: "+salarioS);
        leer.close();
    }
}
