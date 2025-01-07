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
public class Ejercicio6 {
    /*
    Hacer un programa que calcule el cuadrado de una suma.  (a+b) al cuadrado = a al cuadrado + b al cuadrado + 2ab
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float a,b, cuadradoS;
        
        System.out.println("=== CUADRADO DE UNA SUMA ===");
        System.out.print("A: ");
        a = Float.parseFloat(leer.nextLine());
        System.out.print("B: ");
        b = Float.parseFloat(leer.nextLine());
        
        cuadradoS = (float) Math.pow((a+b), 2);
        
        System.out.println("\n(A+B) al cuadrado : "+cuadradoS);
        leer.close();
    }
}
