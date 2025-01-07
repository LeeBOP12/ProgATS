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
public class Ejercicio3 {
    /*
    Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que posee 
    Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("=== DINERO DE 3 AMIGOS ===");
        System.out.print("Dinero de Guillermo: ");
        guillermo = Float.parseFloat(leer.nextLine());
        
        luis = guillermo/2;
        juan = (luis+guillermo)/2;
        total = guillermo+luis+juan;
        
        System.out.println("\n=== SALDO DE LOS 3 ===");
        System.out.println("Guillermo: "+guillermo);
        System.out.println("Luis: "+luis);
        System.out.println("Juan: "+juan);
        System.out.println("\nEntre los 3 tienen: "+total);
    }
}
