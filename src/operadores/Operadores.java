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
public class Operadores {
    /*
    "+" = suma 
    "-" = resta 
    "*" = multiplicacion 
    "/" = division 
    "%" = residuo, resto o modulo
    */
    
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        float num1, num2, suma, resta, multi, division, residio;
        
        System.out.println("==== INGRESE 2 NUMEROS ====");
        System.out.print("Numero 1: ");
        num1 = Float.parseFloat(leer.nextLine());
        System.out.print("Numero: ");
        num2 = Float.parseFloat(leer.nextLine());
        
        suma = num1+num2;
        resta = num1-num2;
        multi = num1*num2;
        division = num1/num2;
        residio = num1%num2;
        
        System.out.println("==== OPERACIONES BASICAS ====");
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Mutilplicacion: "+multi);
        System.out.println("Division: "+division);
        System.out.println("Residuo: "+residio);
        
    }
}
