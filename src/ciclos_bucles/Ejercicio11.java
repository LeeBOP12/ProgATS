/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio11 {
    /*
    Diseñar un programa que muestre el producto de los 10 primeros números impares
    */
    public static void main (String[] args){
        long producto=1;
        System.out.println("=== PRODUCTO DE LOS PRIMEROS 10 NUMEROS IMPARES ===");
        for (long i = 1; i <= 20; i++) {
            if (i%2==1) {
                producto*=i;
            }
        }
        System.out.println("\nProducto de Numeros Impares: "+producto);
    }
}
