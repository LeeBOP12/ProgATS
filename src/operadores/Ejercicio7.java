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
public class Ejercicio7 {
    /*
    Construir un programa que, dado un numero total de horas devuelve el numero de semanas, días y horas equivalentes. 
    Por ejemplo un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int horas, semanas, dias, horasr;
        
        System.out.println("=== CONVERSION DE HORAS ===");
        System.out.print("Cant. Horas: ");
        horas = Integer.parseInt(leer.nextLine());
        
        semanas = horas/168; //Horas en una semana
        dias = (horas%168)/24; //Lo restante lo dividimos las horas en un dia
        horasr = horas%24; //Horas restantes
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas Restantes: "+horasr);
        
        
    }
}
