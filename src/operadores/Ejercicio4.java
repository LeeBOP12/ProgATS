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
public class Ejercicio4 {
    /*
    Una compañía de venta de carros usados, paga a su personal de ventas un salario de 1000 USD mensuales, mas una comisión 
    de 150 USD por carro vendido, mas el 5% del valor de la venta por  carro. Cada mes el capturista de la empresa ingresa en 
    la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float salario, comision, precioCarro, bono;
        int cantCarros;
        System.out.println("=== VENTA DE CARROS ===");
        System.out.print("Cantidad de Carros: ");
        cantCarros = Integer.parseInt(leer.nextLine());
        System.out.print("Precio de cada carro: ");
        precioCarro = Float.parseFloat(leer.nextLine());
        
        comision = cantCarros*150;
        bono = 0.05f*(precioCarro*cantCarros);
        salario = 1000 + comision + bono;
        
        System.out.println("\n=== GANANCIA ===");
        System.out.println("Salario: "+salario);
        leer.close();
    }
}
