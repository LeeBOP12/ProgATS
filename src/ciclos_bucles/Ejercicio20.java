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
public class Ejercicio20 {

    /*
    Pedir un número N, introducir N sueldos y mostrar el sueldo máximo
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        float sueldos, sueldoMax = 0;
        System.out.println("=== SUELDO MAXIMO ====");
        do {
            System.out.print("Numero de Sueldos: ");
            numero = Integer.parseInt(leer.nextLine());
            if (numero <= 0) {
                System.out.println("< INGRESE CANTIDAD VALIDA >");
            }
        } while (numero <= 0);
        for (int i = 1; i <= numero; i++) {
            System.out.print("Sueldo " + i + ": ");
            sueldos = Float.parseFloat(leer.nextLine());
            if (sueldos > sueldoMax) {
                sueldoMax = sueldos;
            }
        }
        System.out.println("=== RESULTADOS ===");
        System.out.println("Sueldo maximo: " + sueldoMax);
        leer.close();
    }
}
