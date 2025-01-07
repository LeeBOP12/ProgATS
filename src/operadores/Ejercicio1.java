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
public class Ejercicio1 {
    //Calcular la suma de 3 notas
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float n1, n2, n3, suma;
        
        System.out.println("=== NOTAS ===");
        System.out.println("Digite 3 notas: ");
        n1 = Float.parseFloat(leer.nextLine());
        n2 = Float.parseFloat(leer.nextLine());
        n3 = Float.parseFloat(leer.nextLine());
        
        suma = n1+n2+n3;
        System.out.println("\n=== SUMA ===");
        System.out.println("Suma de notas: "+suma);
    }
}
