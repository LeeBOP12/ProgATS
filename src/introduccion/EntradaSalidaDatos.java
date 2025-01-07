/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class EntradaSalidaDatos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int entero;
        float decimal;
        String cadena;
        char letra;
        System.out.println("=== INGRESE DATOS ====");
        System.out.print("Numero: ");
        entero = leer.nextInt();
        System.out.print("Deicaml: ");
        decimal = leer.nextFloat();
        leer.nextLine();
        System.out.println("Cadena: ");
        cadena = leer.nextLine();
        System.out.print("Letra: ");
        letra = leer.next().charAt(0);
        
        System.out.println("=== DATOS INGRESADOS ===");
        System.out.println("Numero: "+entero);
        System.out.println("Deceimal: "+decimal);
        System.out.println("Cadena: "+cadena);
        System.out.println("Letra: "+letra);
    }
}
